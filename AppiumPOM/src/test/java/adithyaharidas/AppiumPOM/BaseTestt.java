package adithyaharidas.AppiumPOM;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTestt {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@BeforeClass
	public void configappium() throws MalformedURLException
	{
		 service=new AppiumServiceBuilder().withAppiumJS(new File("C://Users//harid//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
				service.start();
				
				UiAutomator2Options options = new UiAutomator2Options();
				options.setDeviceName("AdithyaPhone");
				//options.setApp("C://Users//harid//eclipse-workspace//Appium//src//test//java//resources//ApiDemos-debug.apk");
				options.setApp("C://Users//harid//eclipse-workspace//Appium//src//test//java//resources//General-Store.apk");
				//options.setChromedriverExecutable("C://Users//harid//Downloads//chromedriver_win32 (1)//chromedriver.exe");
				 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}

	@AfterClass
	public void teardown()
	{
		driver.quit();
		service.stop();
	}

}
