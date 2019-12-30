package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageObjects {

	public WebDriver driver;
	public LandingPageObjects(WebDriver driver) {
		this.driver=driver;
	}
		
	By LoginButton=By.cssSelector("a[href*='sign_in']");
	By title=By.className("text-center");
	By navBar=By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav");
		
	public WebElement getLogin() {
		return driver.findElement(LoginButton);
	}
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	public WebElement getNavBar() {
		return driver.findElement(navBar);
	}
}
