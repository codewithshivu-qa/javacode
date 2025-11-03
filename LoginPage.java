package practisemavenpackage.practisemavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement clickcontinue;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement login;
	
	public void un()
	{
		username.sendKeys("9535561016");
	}
	
	public void click()
	{
		clickcontinue.click();
	}
	public void pw()
	{
		password.sendKeys("9743875210");
	}
	public void lgin()
	{
		login.click();
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
