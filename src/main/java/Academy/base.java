package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class base {

	public void initializeDriver(String broswerName) throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\nsavali\\git\\E2E_Framework_Design\\E2EFramework\\src\\main\\java\\Academy\\data.properties");
		
		prop.load(fis);
		prop.getProperty("browser");
		
		//commentakjasdfj
		
		
	}
}
