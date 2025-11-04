package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class UploadResumeToNaukri {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 1: Go to login page
        driver.get("https://www.naukri.com/nlogin/login");

        // Step 2: Log in
        driver.findElement(By.id("usernameField")).sendKeys("shivumv1016@gmail.com");
        driver.findElement(By.id("passwordField")).sendKeys("Spizz.9nCM$KTH4");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        // Step 3: Click "View Profile"
        Thread.sleep(3000); // Wait for login to complete
        WebElement profileLink = driver.findElement(By.xpath("//div[@class='view-profile-wrapper']/a"));
        profileLink.click();

        // Step 4: Scroll to Resume Upload button (we'll guess the selector now)
        Thread.sleep(3000); // Wait for profile page to load
        WebElement uploadBtn = driver.findElement(By.cssSelector(".dummyUpload.typ-14Bold"));

        // Optional: highlight it
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", uploadBtn);
        js.executeScript("arguments[0].scrollIntoView(true);", uploadBtn);
        Thread.sleep(2000);

        // Step 5: Click the button
        try {
            uploadBtn.click();
        } catch (Exception e) {
            System.out.println("Regular click failed, trying JS click...");
            js.executeScript("arguments[0].click();", uploadBtn);
        }

        // Step 6: Upload file (this will only work if <input type="file"> is present)
        WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
        fileInput.sendKeys("C:\\Users\\shivakumar mv\\Documents\\resume.pdf");

        // Done!
        Thread.sleep(5000);
        driver.quit();
    }
}
