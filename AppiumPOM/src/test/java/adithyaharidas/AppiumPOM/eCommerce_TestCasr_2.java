package adithyaharidas.AppiumPOM;

import org.testng.annotations.Test;

public class eCommerce_TestCasr_2 extends BaseTestt {
	
	@Test
	public void CheckPricee() throws InterruptedException
	{
		FormFill formpage=new FormFill(driver);
		formpage.setNameField("Adithya Haridas");
		formpage.setGender("female");
	}

}
