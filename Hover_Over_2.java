//hover amazon language dropdown and select kannada language//
package hoverover;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_Over_2 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement e1 = driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		 
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/ul/li[6]/a/span/span[1]"));
		e2.click();
		
		
		//need to check this script language is not clicking//
		//see you later definetely//
	}
	
	

}
