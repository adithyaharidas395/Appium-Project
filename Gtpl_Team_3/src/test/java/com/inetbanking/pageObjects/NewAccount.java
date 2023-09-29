package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


	public class NewAccount {
	    WebDriver driver;
	    
	    By AddAccou=By.xpath("/html/body/div[3]/div/ul/li[5]/a");
	    
	    By CId_txt = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input");
	    By AccType_Opt = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select");
	    By InitDep_TxtBx = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input");
	    By sub_Btn = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]");
	    By clr_btn = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]");
	    
	    public NewAccount(WebDriver d){
		       driver=d;
		   }
	    public void NewAccountDetails() {
	        driver.findElement(AddAccou).click();
	    }
	    public void EnterCustomerId(String Customer) {
	        driver.findElement(CId_txt).sendKeys(Customer);
	    }
	    public void TypeofAccount() {
	        driver.findElement(AccType_Opt).click();
	    }
	    public void FirstDeposit(String Money) {
	        driver.findElement(InitDep_TxtBx).sendKeys(Money);
	    }
	    public  void ClickBtn() {
	        driver.findElement(sub_Btn).click();
	    }
	    public void ClearBtn() {
	        driver.findElement(clr_btn).click();
	    }



	}

