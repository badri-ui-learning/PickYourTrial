package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.FrameworkConstants;
import factories.DriverFactory;
import utils.PropertyUtils;

public class Driver 
{
	public static String browserValue = "";
	public static WebDriver driver;
	
	public static void initDriver() throws Exception
	{
		if(DriverManager.getDriver()==null)
		{		
			browserValue = PropertyUtils.get("browser");
			DriverManager.setDriver(DriverFactory.getDriver(browserValue));
			DriverManager.getDriver().manage().window().maximize();			
		}
	}
	
	public static void quitDriver()
	{
		if(DriverManager.getDriver()!=null)
		{
			DriverManager.getDriver().quit();
			DriverManager.setDriver(null);
		}
	}
}
