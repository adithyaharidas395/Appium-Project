package com.intebanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.intebanking.utilities.ExcelUtility;

public class TC_LoginDDT extends BaseClass {
	@Test(dataProvider="LoginData")
	public void loginDDt(String user,String pwd)
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterlogin(username);
		lp.enterpassword(password);
		lp.loginbuttonclick();
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
			lp.clicklogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}
	
	
	public boolean isAlertPresent() 
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}catch(NoAlertPresentException e)
		{
			return false;
		}
	}
	

	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/intebanking/testData/LoginData.xlsx";
		int rownum=ExcelUtility.getRowCount(path, "Sheet1");
		int colcount=ExcelUtility.getCellCount(path, "Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			System.out.println(i);
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=ExcelUtility.getCellData(path, "Sheet1", i,j);
				System.out.println(j);
			}
			
		}
		return logindata;
	}
}
