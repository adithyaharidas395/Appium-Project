package adithyahraidas.Appium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_TC_2 extends BaseTest {
	
	@Test
	public void CheckPrice() throws InterruptedException
	{
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Adithya");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		

		int NumberOfItems=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size(); 
		List <WebElement> price=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));//storeing both the items to a list
		float sum=0;
		for(int i=0;i<NumberOfItems;i++)
		{
			String amount=price.get(i).getText(); //used to get each item from the list
			float finalamount=Float.parseFloat(amount.substring(1)); //converting the string into float and getting rid of the starting $
			sum=sum+finalamount;
			
		}
		System.out.println(sum);
		
		String displayedamount=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		float finalamount=Float.parseFloat(displayedamount.substring(1));
		
		Assert.assertEquals(finalamount, sum);
		
	WebElement ele=	driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
	LongPressAction(ele);
	driver.findElement(By.id("android:id/button1")).click();
	driver.findElement(By.xpath("//android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	
	Thread.sleep(9000);
	
	Set<String> contexts= driver.getContextHandles();//used to find all the contexts   NP:only when we go to browser we geet its context
	for(String s:contexts) //enhanced for loop
	{
		System.out.println(s);
	}
		driver.context("WEBVIEW_com.androidsample.generalstore"); // switching context
		//driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("amazon");
		Thread.sleep(2000);
		
		}
	
	
	

}
