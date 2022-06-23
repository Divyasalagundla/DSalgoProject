package Assingments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotsNegative {
	public static void main(String[] args) throws IOException, InterruptedException {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  String URL="http://automationpractice.com/index.php";
		  driver.get(URL);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		  driver.manage().window().maximize();

		  //Click on Sign in
		  driver.findElement(By.linkText("Sign in")).click();
		  driver.findElement(By.id("authentication"));
		  driver.findElement(By.id("email")).sendKeys("xyadgemcd.c");
		  driver.findElement(By.id("passwd")).sendKeys("ironman");
		  driver.findElement(By.id("SubmitLogin"));
		  
		 // Create File object and save screenshot of current webpage inside it
			   File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile, new File("./image2.png"));
			Thread.sleep(2000);
				// Close browser
				driver.close();
				driver.quit();
			  

}
}
