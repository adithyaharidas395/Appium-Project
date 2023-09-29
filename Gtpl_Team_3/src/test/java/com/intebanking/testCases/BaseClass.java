package com.intebanking.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.DeleteAccount;
import com.inetbanking.pageObjects.DeleteCustomer;
import com.inetbanking.pageObjects.EditAccount;
import com.inetbanking.pageObjects.EditCustomer;
import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.LogouPage;
import com.inetbanking.pageObjects.MiniStatement;
import com.inetbanking.pageObjects.NewAccount;
import com.intebanking.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURl=readconfig.getApllicationURL();
	public String username=readconfig.getUsernameL();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	LoginPage loginpage;
	EditCustomer editCustom;
	AddCustomerPage addCustom;
	DeleteAccount deleteAccount;
	DeleteCustomer deleteCustm;
	NewAccount addAccount;
	LogouPage logoutPage;
	EditAccount editAccount;
	MiniStatement mini;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			System.setProperty( "webdriver.edge.driver", readconfig.getedgePath());
		        
		         driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURl);
		driver.manage().window().maximize();
		 LoginPage lp=new LoginPage(driver);
			lp.enterlogin(username);
			lp.enterpassword(password);
			lp.loginbuttonclick();
			
		loginpage = new LoginPage(driver);
		addCustom= new AddCustomerPage(driver);
		editCustom= new EditCustomer(driver);	
		deleteAccount = new DeleteAccount(driver);
		deleteCustm = new DeleteCustomer(driver);
		addAccount = new NewAccount(driver);
		logoutPage = new LogouPage(driver);
		editAccount = new EditAccount(driver);
		mini=new MiniStatement(driver);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

	public void captureScreen(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+ tname +".png");
		FileUtils.copyFile(source,target);
		System.out.println("Screenshot taken");
	}
	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		return(generatedstring);
	}

}
