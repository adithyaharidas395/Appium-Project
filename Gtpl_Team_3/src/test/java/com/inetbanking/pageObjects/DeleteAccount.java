package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccount {
WebDriver driver;
    
    
    By DeleteAcc=By.xpath("/html/body/div[3]/div/ul/li[7]/a");
    By EnterAcc_Box = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input");
    By SEA_Btn = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]");
    By Cle_Btn = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[2]");
    
    public DeleteAccount(WebDriver d)
	{
		this.driver=d;
		
	}
    public void DeleteAccountDetails(){
        driver.findElement(DeleteAcc).click();
    }
    public void EnterTheAccountNo(String AccountNo) {
        driver.findElement(EnterAcc_Box).sendKeys(AccountNo);
    }
    public void ClickSearch() {
        driver.findElement(SEA_Btn).click();
    }
    public void ClickReset() {
        driver.findElement(Cle_Btn).click();
    }




}
