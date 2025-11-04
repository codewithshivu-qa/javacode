package takingscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Taking_Screenshot 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
//Step1: Upcasting driver to TakesScreenshot here TakesScreenshot is noting but Interface//
//Step2: Utilizing abstract method to take capture calles getScreenshotAs(Outputtype.FILE)//
//Step3: Creating File Object to store the Screenshot in a location//	
//Step4: By using FileClass Handler copying the file from source to destination//
		
		 TakesScreenshot ts = driver;
		 File source= ts.getScreenshotAs(OutputType.FILE);
		 
		 File destination = new File("C:\\Users\\shivakumar mv\\OneDrive\\Documents\\Screenots of automation\\Case"+Math.random()+".png");
		 FileHandler.copy(source, destination);
	}

}
