package com.intebanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.CustomisedStatement;

public class Tc_Cust_Statement_Gtpl extends BaseClass{
	@Test
    public void LoginTest() throws IOException, InterruptedException
    {
        
       


		CustomisedStatement CustState=new CustomisedStatement(driver);
          Thread.sleep(3000);
          CustState.clickCustomisedstatement();
          CustState.enterAccountnumber("123456789");
          CustState.enterFromDate("12102022");
          CustState.enterTodate("14112022");
          CustState.enterAmountlimit("150000");
          CustState.enternumberoftran("100");
          Thread.sleep(3000);
          CustState.clicksubmit();
}
}
