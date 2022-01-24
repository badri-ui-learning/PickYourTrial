package pages;

import org.openqa.selenium.By;

import driver.DriverManager;

public class LoginPage 
{
	By usernameTextbox = By.xpath("//input[@placeholder='Enter Email/Mobile number']");
	By passwordTextbox = By.xpath("//input[@placeholder='Password']");
	By loginButton = By.xpath("//button[text()='Login']");
	By usernameError = By.xpath("//span[text()='Enter your valid email/mobile number']");
	By passwordError = By.xpath("//span[text()='Enter your registered mobile number and password']");
	By signupLink = By.xpath("//button[text()='Sign up to get free quotes']");
	
	public void enterUsername(String username)
	{
		DriverManager.getDriver().findElement(usernameTextbox).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		DriverManager.getDriver().findElement(passwordTextbox).sendKeys(password);
	}
	
	public void clickLogin()
	{
		DriverManager.getDriver().findElement(loginButton).click();
	}
	
	public boolean isExistsUsernameError()
	{
		if(DriverManager.getDriver().findElement(usernameError).isDisplayed())
		{
			return true;
		}
		return false;
	}
	
	public boolean isExistsPasswordError()
	{
		if(DriverManager.getDriver().findElement(passwordError).isDisplayed())
		{
			return true;
		}
		return false;
	}
	
	public void clickSignupLink()
	{
		DriverManager.getDriver().findElement(signupLink).click();
	}
	
}
