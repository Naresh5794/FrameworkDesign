package Academy;

import java.io.IOException;
import org.testng.annotations.Test;

import resources.base;

public class homePage extends base{

	@Test
	public void basePageNavigation() throws IOException {
		
		driver =initializeDriver();
		driver.get("http://www.qaclickacademy.com");
		
		
	}
	
}
