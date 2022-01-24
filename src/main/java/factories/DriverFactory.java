package factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.FrameworkConstants;

public class DriverFactory 
{
	public static WebDriver getDriver(String browserName)
	{
		WebDriver driver = null;
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", FrameworkConstants.getFirefoxDriverPath());
			driver = new FirefoxDriver();
		}
		
		return driver;
	}
}
