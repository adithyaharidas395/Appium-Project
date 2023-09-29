package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteCustomer {
	WebDriver driver;
    By DeleteCust=By.xpath("/html/body/div[3]/div/ul/li[4]/a");
    By Customerid= By.name("cusid");
    By CustSubmit=By.name("AccSubmit");
    By clickrest=By.name("res");
public DeleteCustomer(WebDriver d)
{
   driver=d;
}
public void DeleteCus()
{
   driver.findElement(DeleteCust).click();
}
public void DeleteCust(String CustId)
{
  driver.findElement(Customerid).sendKeys(CustId);
}
public void clicksubmit()
{
   driver.findElement(CustSubmit).click();
}
public void clickre()
{
	driver.findElement(clickrest).click();
}

}
