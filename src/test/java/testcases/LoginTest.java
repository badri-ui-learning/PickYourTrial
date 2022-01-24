package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import constants.FrameworkConstants;
import driver.Driver;
import driver.DriverManager;
import pages.HomePage;
import pages.LoginPage;
import reports.ExtentLogger;
import utils.JSONUtils;
import utils.PropertyUtils;

public class LoginTest extends BaseTest
{
	HomePage homepage;
	LoginPage loginpage;
	
	private LoginTest()
	{
		homepage = new HomePage();
		loginpage = new LoginPage();
	}
	
	@BeforeMethod(groups = {"SanityTest"})
	public void clickLoginButton() throws Exception
	{
		DriverManager.getDriver().get(PropertyUtils.get("url"));		
		homepage.clickLoginButton();
		Thread.sleep(2000);	
	}
	
	@Test(priority = 0,groups = {"SanityTest"})
	public void loginWithNoCredentials() throws Exception
	{		
		loginpage.clickLogin();
		Thread.sleep(2000);
		
		AssertJUnit.assertTrue(loginpage.isExistsUsernameError());
		AssertJUnit.assertTrue(loginpage.isExistsPasswordError());
		
	}
	
	
	@Test(priority = 1)
	public void checkPasswordError() throws Exception
	{
		loginpage.enterUsername(JSONUtils.get("username"));
		loginpage.clickLogin();
		Thread.sleep(2000);		
		AssertJUnit.assertTrue(loginpage.isExistsPasswordError());
	}
	
}
