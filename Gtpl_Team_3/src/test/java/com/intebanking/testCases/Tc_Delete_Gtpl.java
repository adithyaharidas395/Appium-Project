package com.intebanking.testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DeleteCustomer;
//import com.inetbanking.pageObjects.DeleteCustomerPage;
//import com.inetbanking.pageObjects.DeleteCustomerPage;

public class Tc_Delete_Gtpl extends BaseClass{
//	WebDriver driver;
	@Test
	 public void DeleteCust() throws IOException, InterruptedException
    {
		DeleteCustomer deleteCustm=new DeleteCustomer(driver);
		deleteCustm.DeleteCus();
		Thread.sleep(3000);
		deleteCustm.DeleteCust("897845");
		Thread.sleep(3000);
		deleteCustm.clicksubmit();
		 
    }
	@Test
	public void testreset() throws InterruptedException, IOException
	{
		driver.navigate().to("https://demo.guru99.com/V1/html/DeleteCustomerInput.php");
		DeleteCustomer delc=new DeleteCustomer(driver);
		
		delc.DeleteCust("123");
		delc.clickre();
		String textid=	driver.findElement(By.name("cusid")).getText();
		if(textid.isEmpty())
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"deleteCustomer");
			Assert.assertTrue(false);
		}
	}
	@Test
	public void blankdelete() throws InterruptedException, IOException
	{
	
		driver.navigate().to("https://demo.guru99.com/V1/html/DeleteCustomerInput.php");
		DeleteCustomer delc=new DeleteCustomer(driver);
		
		delc.DeleteCus();
		Thread.sleep(2000);
		
		
		Alert alert=driver.switchTo().alert();
		String alerttex=alert.getText();
		System.out.println(alerttex);
		if(alerttex.equals("Please fill all fields"))
		{
			driver.switchTo().alert().accept();
			Assert.assertTrue(true);
		}
		
		else
		{
			captureScreen(driver,"addnewCustomer");
			Assert.assertTrue(false);
		}
	}
}
