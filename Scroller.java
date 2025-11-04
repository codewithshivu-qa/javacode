package scroller;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroller {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement e1 = driver.findElement(By.xpath("//a[.='About Amazon']"));
		
		JavascriptExecutor js = (JavascriptExecutor)  driver;
		js.executeScript("window.scrollBy(0,4300)");
		
		e1.click();
		
		
	}

}
