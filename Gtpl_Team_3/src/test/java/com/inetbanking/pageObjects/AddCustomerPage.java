package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	By addcustomer=By.xpath("/html/body/div[3]/div/ul/li[2]/a");
	By cname=By.name("name");
	By gender=By.name("rad1");
	By dob=By.name("dob");
	By address=By.name("addr");
	By city=By.name("city");
	By state=By.name("state");
	By pin=By.name("pinno");
	By phone=By.name("telephoneno");
	By email=By.name("emailid");
	By submit=By.name("sub");
	By reset=By.name("res");
	
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		
	}

	
	public void clickonaddcustomer()
	{
		ldriver.findElement(addcustomer).click();
	}

	public void entercusname(String cuname)
	{
		ldriver.findElement(cname).sendKeys(cuname);
	}
	public void customergender(String cgender)
	{
		ldriver.findElement(gender).click();
	}
	public void enterdob(String mm,String dd,String yy)
	{
		ldriver.findElement(dob).sendKeys(mm);
		ldriver.findElement(dob).sendKeys(dd);
		ldriver.findElement(dob).sendKeys(yy);
	}
	public void enteraddress(String caddress)
	{
		ldriver.findElement(address).sendKeys(caddress);;
	}
	public void entercity(String ccity)
	{
		ldriver.findElement(city).sendKeys(ccity);;
	}
	public void enterstate(String cstate)
	{
		ldriver.findElement(state).sendKeys(cstate);;
	}public void enterpin(String cpin)
	{
		ldriver.findElement(pin).sendKeys(cpin);;
	}
	public void enterphone(String cphone)
	{
		ldriver.findElement(phone).sendKeys(cphone);;
	}
	public void enteremail(String cemail)
	{
		ldriver.findElement(email).sendKeys(cemail);
	}
	public void clicksubmit()
	{
		ldriver.findElement(submit).click();
	}
	public void clickreset()
	{
		ldriver.findElement(reset).click();
	}
}
