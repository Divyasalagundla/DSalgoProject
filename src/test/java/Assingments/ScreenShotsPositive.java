package Assingments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotsPositive {
	public static void main(String[] args) throws IOException, InterruptedException {
		 
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  String URL="http://automationpractice.com/index.php";

		  driver.get(URL);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		  driver.manage().window().maximize();
		  
		  //Click on Sign in
		  driver.findElement(By.linkText("Sign in")).click();
		  
		  //Enter email address
		  driver.findElement(By.cssSelector("[name='email_create']")).sendKeys("Divya154912345@test.com");
		  Thread.sleep(1000);
		  
		  //Click on "Create an account"
		  driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();
		  Thread.sleep(1000);
		  //Select Title
		  driver.findElement(By.xpath("//input[@id=\"id_gender2\"]")).click();
		  driver.findElement(By.name("customer_firstname")).sendKeys("Test User");
		  driver.findElement(By.name("customer_lastname")).sendKeys("Vsoft");
		  driver.findElement(By.id("passwd")).sendKeys("PKR@PKR");
		  Thread.sleep(1000);
		// Enter your address
		  driver.findElement(By.id("firstname")).sendKeys("Test User");
		  driver.findElement(By.id("lastname")).sendKeys("Vsoft");
		  driver.findElement(By.id("company")).sendKeys("Vsoft");
		  driver.findElement(By.id("address1")).sendKeys("Test 81/1,2nd cross");
		  driver.findElement(By.id("city")).sendKeys("XYZ");
		  Thread.sleep(1000);
		// Select State
		  WebElement statedropdown=driver.findElement(By.name("id_state"));
		  Select oSelect=new Select(statedropdown);
		  oSelect.selectByValue("10");

		  driver.findElement(By.name("postcode")).sendKeys("30329");
		  Thread.sleep(1000);
		  // Select Country
		  WebElement countrydropDown=driver.findElement(By.name("id_country"));
		  Select oSelectC=new Select(countrydropDown);
		  oSelectC.selectByVisibleText("United States");
		  Thread.sleep(1000);
		  //Enter Mobile Number
		  driver.findElement(By.id("phone_mobile")).sendKeys("2258064187");
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Office");
		  driver.findElement(By.name("submitAccount")).click();
		 
		  String userText=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
		  Thread.sleep(1000);
		  // Validate that user has created
		  if(userText.contains("Vsoft")) {
		   System.out.println("User Verified,Test case Passed");
		   
		// Create File object and save screenshot of current webpage inside it
		   File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile, new File("./image1.png"));
		
			// Close browser
			driver.close();
			driver.quit();
		  

}

}

}
