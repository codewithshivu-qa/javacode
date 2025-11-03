package practisemavenpackage.practisemavenproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//step1: locating each component using @FindBy annotations
	
	WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	
	@FindBy(xpath="//span[@class='nav-action-inner']")
	WebElement signin_tologin;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search_item;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement click_search;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signout;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal'])[1]")
	WebElement clickingtheproduct;
	
	@FindBy(xpath="(//input[@id='add-to-cart-button'])[2]")
	WebElement addtocart;
	
	@FindBy(xpath="//a[@class='a-link-normal attach-close-button']")
	WebElement cancel;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement cart;
	
	@FindBy(xpath="//input[@name='submit.delete-active.95c92d4c-e3bf-470f-861c-62e6cfdbd901']")
	WebElement deletecart;
	
	
	//step2 : Creating a method to perform its own action of each component
	public void accandlist(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	
	}
	public void signin()
	{
		signin_tologin.click();
	}
	public void search_product()
	{
		search_item.sendKeys("Samsung galaxy s25 ultra");
	}
	public void search()
	{
		click_search.click();
	}
	public void accountandlist()
	{
		Actions a2 = new Actions(driver);
		a2.moveToElement(accountandlist).perform();
	}
	public void logedout()
	{
		signout.click();
	}
	public void clickproduct()
	{
		clickingtheproduct.click();
	}
	public void addtocarts()
	{
	  Set<String> s1= driver.getWindowHandles();
	  Iterator<String> i1= s1.iterator();
	  String parentid = i1.next();
	  String childid = i1.next();
	  
	  driver.switchTo().window(childid);
	 
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,300)");
	  addtocart.click();
	}
	public void cancelpopup()
	{
		cancel.click();
	}
	public void cartclick()
	{
		cart.click();
	}
	public void deleteitem()
	{
		deletecart.click();
	}
	
	
	//step3 : initializing the step 1 element by using pageFactory class inside the Constructor
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	

}
