package com.intebanking.testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest extends BaseClass {
	
	@Test
	public void logintest() throws IOException
	{
		
		
		LoginPage lp=new LoginPage(driver);
		lp.enterlogin(username);
		lp.enterpassword(password);
		lp.loginbuttonclick();
		
	
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"logintest");
			Assert.assertTrue(false);
		}
	}

}
