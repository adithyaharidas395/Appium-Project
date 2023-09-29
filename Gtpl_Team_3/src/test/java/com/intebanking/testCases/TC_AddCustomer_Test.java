package com.intebanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AddCustomer_Test extends BaseClass {
	@Test
	public void addnewcustomer() throws InterruptedException, IOException
	{
		
		
		AddCustomerPage addc=new AddCustomerPage(driver);
		
		addc.clickonaddcustomer();
		addc.entercusname("Adithya");
		addc.customergender("Male");
		addc.enterdob("11", "09", "2000");
		Thread.sleep(3000);
		addc.enteraddress("Thrissur,Kerala");
		addc.entercity("Thrissur");
		addc.enterstate("Kerala");
		addc.enterpin("123456");
		addc.enterphone("9656901111");
		String email=randomstring()+"@gmail.com";
		addc.enteremail(email);
		addc.clicksubmit();
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Connection failed:");
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"addnewCustomer");
			Assert.assertTrue(false);
		}
		//driver.navigate().back();
	}
	
	@Test
	public void checkresetbutton() throws InterruptedException, IOException
	{
		driver.navigate().to("https://demo.guru99.com/V1/html/addcustomerpage.php");
		AddCustomerPage addc=new AddCustomerPage(driver);
		addc.entercusname("Adithya");
		addc.customergender("Male");
		addc.enterdob("11", "09", "2000");
		Thread.sleep(3000);
		addc.enteraddress("Thrissur,Kerala");
		addc.entercity("Thrissur");
		addc.clickreset();
		boolean res1=driver.getPageSource().contains("Adithya");
		if(res1==true)
		{
			captureScreen(driver,"addnewCustomer");
			Assert.assertTrue(false);
		}
		else
		{
			
			Assert.assertTrue(true);
		}
	}
	@Test
	public void withoutemail() throws InterruptedException, IOException
	{
		driver.navigate().to("https://demo.guru99.com/V1/html/addcustomerpage.php");
		AddCustomerPage addc=new AddCustomerPage(driver);
		addc.entercusname("Adithya");
		addc.customergender("Male");
		addc.enterdob("11", "09", "2000");
		Thread.sleep(3000);
		addc.enteraddress("Thrissur,Kerala");
		addc.entercity("Thrissur");
		addc.enterstate("Kerala");
		addc.enterpin("123456");
		addc.enterphone("9656901111");
		addc.clicksubmit();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String alertontext=alert.getText();
		System.out.println(alertontext);
		
		
	//	boolean res=driver.getPageSource().contains("Please fill all fields");
		if(alertontext.equals("Please fill all fields"))
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
