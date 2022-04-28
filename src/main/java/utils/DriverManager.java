package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	public static WebDriver driver;
	 public WebDriver AbrirUrl() throws Exception{
		  
		 if(driver == null) {
			 
			 System.setProperty("webdriver.chrome.driver", Constants.PATH_CHOMEDRIVER );
			 driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 }
		 DriverContext.setDriver(driver);
		 return driver;

	}

}
