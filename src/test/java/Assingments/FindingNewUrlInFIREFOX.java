package Assingments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingNewUrlInFIREFOX {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.mozilla.org/en-US/firefox/");
		driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement femaleRadioBtn = driver.findElement(By.id("female"));
		femaleRadioBtn.click();
		Thread.sleep(4000);
		WebElement WednesdayCheckBox = driver.findElement(By.id("wednesday"));
		WednesdayCheckBox.click();
		Thread.sleep(2000);
		WebElement FridayCheckBox = driver.findElement(By.id("friday"));
		FridayCheckBox.click();
		Thread.sleep(3000);

		driver.close();
		driver.quit();
	}

}
