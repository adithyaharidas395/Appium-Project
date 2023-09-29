package com.intebanking.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.MiniStatement;

public class Tc_Mini_Statement_Gtpl {
	 WebDriver driver;
	 @Test
public void Logout() throws InterruptedException, IOException{
       
        
	MiniStatement ministate=new MiniStatement(driver);
        Thread.sleep(3000);
        ministate.clickMini();
        ministate.enterAccountNum("8797978");
        ministate.clicksubmit();
}

}
