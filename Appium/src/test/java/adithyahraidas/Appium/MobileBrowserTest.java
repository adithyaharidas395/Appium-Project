package adithyahraidas.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileBrowserTest extends BrowserBaseTest {
	
	@Test
	public void browsertest()
	{
		/*
		driver.getTitle();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("amazon");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		*/
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//button[@class='navbar-toggler']")).click();
		driver.findElement(By.xpath("//a[@class=\'nav-link']")).click();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)", "");
		String text=driver.findElement(By.cssSelector("a[href*='products/3']")).getText();
		Assert.assertEquals(text, "Devops");
		
	}

}
