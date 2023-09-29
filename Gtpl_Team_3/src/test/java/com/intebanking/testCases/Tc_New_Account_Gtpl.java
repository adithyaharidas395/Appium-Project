package com.intebanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.NewAccount;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_New_Account_Gtpl extends BaseClass {
	
	
	  
	    




	    
	     
	    @Test
	    public void AddNewCustomer() throws InterruptedException {
	    	NewAccount NewAcc = new NewAccount(driver);
	    	NewAcc.NewAccountDetails();
	    	NewAcc.EnterCustomerId("4567891230");
	          NewAcc.TypeofAccount();
	          NewAcc.FirstDeposit("10000");
	          NewAcc.ClickBtn();
	        
	    }
	        
	    
	    



//	  


	}

