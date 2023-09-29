package com.intebanking.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.LogouPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_logout_Gtpl {
	WebDriver driver;
	@Test
    public void Logoutpage() throws IOException, InterruptedException {
		
        
        LogouPage logout = new LogouPage(driver);
        logout.clicklogout();
}
}
