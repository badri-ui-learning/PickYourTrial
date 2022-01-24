package pages;

import org.openqa.selenium.By;

import driver.DriverManager;

public class SignupPage 
{
	By signupButton = By.xpath("//button[text()='Create my account']");
	By nameError = By.xpath("//span[text()='Enter your name']");
	By emailError = By.xpath("//span[text()='Enter your mail address']");
	
	public void clickSignup()
	{
		DriverManager.getDriver().findElement(signupButton).click();
	}
	
	public boolean isExistsNameError()
	{
		if(DriverManager.getDriver().findElement(nameError).isDisplayed())
		{
			return true;
		}
		return false;
	}
	
	public boolean isExistsEmailError()
	{
		if(DriverManager.getDriver().findElement(emailError).isDisplayed())
		{
			return true;
		}
		return false;
	}
}
