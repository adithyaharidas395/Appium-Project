package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomisedStatement {
	WebDriver driver;
    
    By Customised=By.xpath("/html/body/div[3]/div/ul/li[9]/a");
    By Accountnum=By.name("accountno");
    By Fdate=By.name("fdate");
    By Tdate=By.name("tdate");
    By Amountlimit=By.name("loweramt");
    By Numtransaction=By.name("tranno");
    By SubmitBut=By.name("AccSubmit");
    
    public CustomisedStatement(WebDriver d)
    {
       driver=d;
    }
    public void clickCustomisedstatement()
    {
        driver.findElement(Customised).click();
    }
    public void enterAccountnumber(String Accnum)
    {
        driver.findElement(Accountnum).sendKeys("Accnum");
    }
    public void enterFromDate(String FDate)
    {
        driver.findElement(Fdate).sendKeys("FDate");
    }
    public void enterTodate(String TDate)
    {
        driver.findElement(Tdate).sendKeys(TDate);
    }
    public void enterAmountlimit(String Amount)
    {
        driver.findElement(Amountlimit).sendKeys(Amount);
    }
    public void enternumberoftran(String NumTran)
    {
        driver.findElement(Numtransaction).sendKeys(NumTran);
    }
    public void clicksubmit()
    {
        driver.findElement(SubmitBut).click();
    }
}

