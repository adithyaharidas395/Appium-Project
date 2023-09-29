package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogouPage {
	WebDriver driver;   
    By ClickBut=By.xpath("/html/body/div[3]/div/ul/li[10]/a");
    
    public LogouPage(WebDriver d)
    {
        driver=d;
    }
    public void clicklogout() {
        driver.findElement(ClickBut).click();
}
}
