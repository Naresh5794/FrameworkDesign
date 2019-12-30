package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageObjects {

	public WebDriver driver;
	public LandingPageObjects(WebDriver driver) {
		this.driver=driver;
	}
		
	By LoginButton=By.cssSelector("a[href*='sign_in']");
		
	public WebElement LandingPage() {
		return driver.findElement(LoginButton);
	}
	
}
