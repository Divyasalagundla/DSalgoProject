package Assingments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoMateSignPositive {
	public static void main(String[]args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		
				driver.get("https://google.com");
				//Navigate the URLx
				driver.navigate().to("https://dsportalapp.herokuapp.com/");
				//Maximize browser window
				driver.manage().window().maximize();
				//Click on Get Start
				  driver.findElement(By.linkText("Get Started")).click();
				  driver.findElement(By.linkText("Sign in")).click();
				//Enter email address
				  driver.findElement(By.name("username")).sendKeys("SalagundlaDivya");
				  driver.findElement(By.name("password")).sendKeys("Dsalgo1234");
				  
				  driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
				  System.out.println("Sign in sucessfully");
				  driver.close();
				  
		
	}

}
