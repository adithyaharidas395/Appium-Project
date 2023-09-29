package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By login=By.name("uid");
	By password=By.name("password");
	By loginbutton=By.name("btnLogin");
	By logout=By.xpath("/html/body/div[3]/div/ul/li[10]/a");
	
	public LoginPage(WebDriver d)
	{
		driver=d;
	}
	
	public void enterlogin(String uname)
	{
		driver.findElement(login).sendKeys(uname);
	}
	
	public void enterpassword(String lpassword)
	{
		driver.findElement(password).sendKeys(lpassword);
	}
	public void loginbuttonclick()
	{
		driver.findElement(loginbutton).click();
	}
	
	public void clicklogout()
	{
		driver.findElement(logout).click();
	}
	
	

}
