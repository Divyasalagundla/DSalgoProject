package Allurereports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllureReports {
	WebDriver driver;
	@BeforeClass
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	public void LaunchUrl() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		//Navigate the URL
		driver.navigate().to("https://dsportalapp.herokuapp.com/");
		driver.manage().window().maximize();
		//Assert.assertEquals(disstatus,true);
		
	}
	@Test(priority=2)
	public void signin() {
		String URL="http://automationpractice.com/index.php";
		 driver.findElement(By.linkText("Sign in")).click();
		  driver.findElement(By.id("authentication"));
		  driver.findElement(By.id("email")).sendKeys("xyadgemcd.c");
		  driver.findElement(By.id("passwd")).sendKeys("ironman");
		  driver.findElement(By.id("SubmitLogin"));
	}
	@Test(priority=3)
	public void CheckBox() {
		driver.get("https://google.com");
		driver.get("https://letskodeit.teachable.com/p/practice");
		String UrlToNavigate="https://courses.letskodeit.com/practice";
		driver.navigate().to(UrlToNavigate);
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
		//Thread.sleep(2000);
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();
		//Thread.sleep(2000);
		
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click();
		//Thread.sleep(3000);
		
	}
	@Test(priority=4)
	public void Registration() {
		driver.get("https://google.com");
		driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
		WebElement femaleRadioBtn = driver.findElement(By.id("female"));
		femaleRadioBtn.click();
		//Thread.sleep(4000);
		WebElement WednesdayCheckBox = driver.findElement(By.id("wednesday"));
		WednesdayCheckBox.click();
		//Thread.sleep(2000);
		WebElement FridayCheckBox = driver.findElement(By.id("friday"));
		FridayCheckBox.click();
		
	}
@Test(priority=5)
public void ScreenShots() {
	throw new SkipException("Skipping this test");
	
}

@AfterClass
public void dropdown() {
	driver.close();
	driver.quit();
	
}
}




