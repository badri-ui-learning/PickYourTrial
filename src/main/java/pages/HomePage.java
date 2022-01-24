package pages;

import org.openqa.selenium.By;

import driver.DriverManager;

public class HomePage 
{
	By loginButton = By.xpath("//div[@tabindex='0']//div[text()='Login']");
	
	public void clickLoginButton()
	{
		DriverManager.getDriver().findElement(loginButton).click();
	}
}
