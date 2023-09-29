package adithyahraidas.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@BeforeClass
	public void startconfig() throws MalformedURLException
	{
		 service=new AppiumServiceBuilder().withAppiumJS(new File("C://Users//harid//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
				service.start();
				
				UiAutomator2Options options = new UiAutomator2Options();
				options.setDeviceName("AdithyaPhone");
				//options.setApp("C://Users//harid//eclipse-workspace//Appium//src//test//java//resources//ApiDemos-debug.apk");
				options.setApp("C://Users//harid//eclipse-workspace//Appium//src//test//java//resources//General-Store.apk");
				options.setChromedriverExecutable("C://Users//harid//Downloads//chromedriver_win32 (1)//chromedriver.exe");
				 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}

	
	public void LongPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),"duration",5000));
	}
	public void Scrolltillend()
	{
		boolean canScrollMore;
		do
		{
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
		
		}while(canScrollMore);
	}
	
	public void SwipeAction(WebElement firstImage,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement)firstImage).getId(),
			   
			    "direction", direction,
			    "percent", 0.75
			));
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		service.stop();
	}

}
