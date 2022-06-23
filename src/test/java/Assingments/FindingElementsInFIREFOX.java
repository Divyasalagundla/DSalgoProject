package Assingments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingElementsInFIREFOX {
	static String baseUrl;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.mozilla.org/en-US/firefox/");
		baseUrl ="https://letskodeit.teachable.com/p/practice";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(baseUrl);
		String UrlToNavigate="https://courses.letskodeit.com/practice";
		driver.navigate().to(UrlToNavigate);
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
		Thread.sleep(2000);
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();
		Thread.sleep(2000);
		
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click();
		Thread.sleep(3000);
		System.out.println("BMW Radio Button is selected?"+bmwRadioBtn.isSelected());
		System.out.println("BMW Checkbox is selected?"+bmwCheckBox.isSelected());
		System.out.println("Benz CheckBox is selected?"+benzCheckBox.isSelected());

		
		driver.close();
		driver.quit();
	}


}
