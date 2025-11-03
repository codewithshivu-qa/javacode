package practisemavenpackage.practisemavenproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Launchandquit 
{
    WebDriver driver;
	@BeforeMethod
	public void launch()
	{
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void quit() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
