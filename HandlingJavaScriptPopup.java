package handlingjavascriptpopup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaScriptPopup {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/javascript-popup/");
		
		WebElement e1 = driver.findElement(By.xpath("//button[@class='btnjs']"));
		e1.click();
		
		driver.switchTo().alert().dismiss(); // this is used to dismiss the javascript popup// if its not there it will give you UnHandledAlertException//



	}

}
