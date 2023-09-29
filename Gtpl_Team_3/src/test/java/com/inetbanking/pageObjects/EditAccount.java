package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditAccount {
WebDriver driver;
    
    By EditAcc=By.xpath("/html/body/div[3]/div/ul/li[6]/a");
    
    By Acc_txtBx = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input");
    By sub_Btn = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]");
    By clr_btn = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[2]");
    public EditAccount (WebDriver d)
	{
		driver=d;
		
	}
    public void EditAccountDetails() {
        driver.findElement(EditAcc);
    }
    public void EnterAccNum(String Accountnum) {
        driver.findElement(Acc_txtBx).sendKeys(Accountnum);
    }
    public void submitOption() {
        driver.findElement(sub_Btn);
    }
    public void ClearOption() {
        driver.findElement(clr_btn);
    }



}

