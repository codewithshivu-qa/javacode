package practisemavenpackage.practisemavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases_1 extends Launchandquit 
{
	@Test
	public void logintoamazon()
	{
		
		
		HomePage h1 = new HomePage(driver);
		h1.accandlist(driver);
		h1.signin();
		
		LoginPage l1 = new LoginPage(driver);
		l1.un();
		l1.click();
		l1.pw();
		l1.lgin();
		
		//checking testcases is passed or not// by using assertion concept//
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"); //---> passed
	}
   
}
