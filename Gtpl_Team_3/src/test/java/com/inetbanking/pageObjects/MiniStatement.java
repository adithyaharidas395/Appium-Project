package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MiniStatement {
	WebDriver driver;
    
    By ClickBut=By.xpath("/html/body/div[3]/div/ul/li[8]/a");
    By Accountnumber = By.name("accountno");
    By sclicksubmit = By.name("AccSubmit");
    public MiniStatement(WebDriver d)
     {
        driver=d;
     }
    public void clickMini() {
        driver.findElement(ClickBut).click();
  }
    public void enterAccountNum(String Anum)
	{
		driver.findElement(Accountnumber).sendKeys(Anum);
	}
     public void clicksubmit() {
        driver.findElement(sclicksubmit).click();



  }
}
