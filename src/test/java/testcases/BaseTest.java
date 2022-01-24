package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import constants.FrameworkConstants;
import driver.Driver;

public class BaseTest 
{	
	@BeforeTest(groups = {"SanityTest"})
	public void setup() throws Exception
	{
		Driver.initDriver();
	}
	
	@AfterTest(groups = {"SanityTest"})
	public void teardown()
	{
		Driver.quitDriver();
	}
}
