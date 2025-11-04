package headlessmode;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Run__Headless_Mode 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeOptions c1 = new ChromeOptions();
		c1.addArguments("--headless");
		
		ChromeDriver driver = new ChromeDriver(c1);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement e1 =driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		
		WebElement e2 = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		e2.click();
		
		WebElement e3 = driver.findElement(By.xpath("//input[@id='ap_email_login']"));
		e3.sendKeys("9535561016");
		
		WebElement e4 = driver.findElement(By.xpath("//input[@class='a-button-input']"));
		e4.click();
		
		Thread.sleep(1000);
		
		WebElement e5 = driver.findElement(By.xpath("//input[@id='ap_password']"));
		e5.sendKeys("9743875210");
		
		WebElement e6 = driver.findElement(By.id("signInSubmit")); 
		 e6.click();
		 
		


	}

}
