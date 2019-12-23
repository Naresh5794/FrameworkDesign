package Academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\nsavali\\git\\E2E_Framework_Design\\E2EFramework\\src\\main\\java\\Academy\\data.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("IE")) {
			driver=new InternetExplorerDriver();
		}		
		else {
			System.out.println("Wrong Browser Name");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
}
