package com.intebanking.testCases;



import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditAccount;

public class Tc_Edit_Account_Gtpl extends BaseClass{
	
	    
	   
	    @Test
	    public void EditAccount() throws InterruptedException {
	        EditAccount EditAcc = new EditAccount(driver);
	        EditAcc.EditAccountDetails();
	        EditAcc.EnterAccNum("7894561230");
	        EditAcc.submitOption();
	        EditAcc.ClearOption();
	         
	        
	    }   
	    }

