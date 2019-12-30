package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	public WebDriver driver;
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	By email=By.cssSelector("[id='user_email']");
	By password=By.cssSelector("[id='user_password']");
	By signInButton=By.cssSelector("[name='commit']");
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement LoginButton() {
		return driver.findElement(signInButton);
	}
}
