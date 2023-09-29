package com.intebanking.testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DeleteAccount;
import com.inetbanking.pageObjects.DeleteCustomer;

public class Tc_Delete_Account_Gtpl extends BaseClass {

	 @Test
	    public void DELETEAccount() throws InterruptedException {
		 DeleteAccount DelAcc = new DeleteAccount(driver);
		 Thread.sleep(3000);
		 DelAcc.DeleteAccountDetails();
	        DelAcc.EnterTheAccountNo("7894561230");
	        DelAcc.ClickSearch();
	       // DelAcc.ClickReset();
	         
	        
	    }
	 @Test
	 public void testreset() throws InterruptedException, IOException
		{
			driver.navigate().to("https://demo.guru99.com/V1/html/deleteAccountInput.php");
		
			 DeleteAccount DelAcc = new DeleteAccount(driver);
			
			DelAcc.EnterTheAccountNo("123");
			DelAcc.ClickReset();
			 Thread.sleep(3000);
			String textid=	driver.findElement(By.name("accountno")).getText();
			if(textid.isEmpty())
			{
				Assert.assertTrue(true);
			}
			else
			{
				captureScreen(driver,"deleteCustomerAccount");
				Assert.assertTrue(false);
			}
		}
	 @Test
	 public void blankdelete() throws InterruptedException, IOException
		{
		
			driver.navigate().to("https://demo.guru99.com/V1/html/deleteAccountInput.php");
			
			 DeleteAccount DelAcc = new DeleteAccount(driver);
			
			DelAcc.ClickSearch();
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
				captureScreen(driver,"deletecustomeraccount");
				Assert.assertTrue(false);
			}
		}
}
