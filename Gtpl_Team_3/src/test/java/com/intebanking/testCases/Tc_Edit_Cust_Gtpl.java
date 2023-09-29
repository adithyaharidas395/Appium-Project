package com.intebanking.testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditCustomer;



public class Tc_Edit_Cust_Gtpl extends BaseClass {

	@Test
	 public void EditCustomer() throws IOException, InterruptedException
     {
		
		EditCustomer editCustm=new EditCustomer(driver);
		editCustm.EditCustmerDetails();
		Thread.sleep(3000);
		editCustm.editCust("897845");
		Thread.sleep(3000);
		editCustm.clicksubmit();
		 
     }
	@Test
	public void checkemptyid() throws InterruptedException, IOException
	{
		driver.navigate().to("https://demo.guru99.com/V1/html/DeleteCustomerInput.php");
		EditCustomer editCustm=new EditCustomer(driver);
		editCustm.clicksubmit();
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
	@Test
	public void  clickreset() throws InterruptedException, IOException 
	{
		driver.navigate().to("https://demo.guru99.com/V1/html/DeleteCustomerInput.php");
		EditCustomer editCustm=new EditCustomer(driver);
		
		Thread.sleep(2000);
		editCustm.editCust("123");
		editCustm.clickreset();
	String textid=	driver.findElement(By.name("cusid")).getText();
	if(textid.isEmpty())
	{
		Assert.assertTrue(true);
	}
	else
	{
		captureScreen(driver,"addnewCustomer");
		Assert.assertTrue(false);
	}
		
	}
	
	
}
