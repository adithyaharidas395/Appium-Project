package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditCustomer {
 WebDriver driver;
 By EditCun=By.xpath("/html/body/div[3]/div/ul/li[3]/a");
     By Customerid= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input");
     By CustSubmit=By.name("AccSubmit");
     By clickreset=By.name("res");
public EditCustomer(WebDriver d)
{
    driver=d;
}


public void EditCustmerDetails()
{
    driver.findElement(EditCun).click();
}

public void editCust(String CustId)
{
   driver.findElement(Customerid).sendKeys(CustId);
}
public void clicksubmit()
{
    driver.findElement(CustSubmit).click();
}
public void clickreset()
{
	driver.findElement(clickreset).click();
}

}