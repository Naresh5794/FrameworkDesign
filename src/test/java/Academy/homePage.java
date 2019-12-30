package Academy;

import java.io.IOException;
import org.testng.annotations.Test;

import resources.LandingPageObjects;
import resources.LoginPageObjects;
import resources.base;

public class homePage extends base{

	@Test
	public void basePageNavigation() throws IOException {
		
		driver =initializeDriver();
		driver.get("http://www.qaclickacademy.com");
		
		LandingPageObjects Landing=new LandingPageObjects(driver);
		Landing.LandingPage().click();
		
		LoginPageObjects Login=new LoginPageObjects(driver);
		Login.getEmail().sendKeys("nareshsavali@gmail.com");
		Login.getPassword().sendKeys("1234567");
		Login.LoginButton().click();
	}
	
}
