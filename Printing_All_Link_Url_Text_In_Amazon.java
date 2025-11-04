//Print all link url text in amazon page//
package printalllinks;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Printing_All_Link_Url_Text_In_Amazon 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> li = driver.findElements(By.tagName("a"));

		
		int count = li.size();  //this will give exact count of url text//
		System.out.println(count);
		
		for(int i=0;i<li.size();i++)
		{
			WebElement e1 =li.get(i);
			//String s1 =e1.getText();
			String s1 = e1.getAttribute("href"); 
			System.out.println(s1);
			
		}
		
		
		
		
		 
		
	

	}

}
