package Assingments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateUserRegisterPositive {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
				//Navigate the URL
				driver.navigate().to("https://dsportalapp.herokuapp.com/");
				//Maximize browser window
				driver.manage().window().maximize();
				//Click on get started
				  driver.findElement(By.linkText("Get Started")).click();
				  //click on  register button
				  driver.findElement(By.linkText("Register")).click();
				//Enter user details
				  driver.findElement(By.name("username")).sendKeys("Sdivya30");
				  //Enter password details
				  driver.findElement(By.name("password1")).sendKeys("Sedt999.");
				  driver.findElement(By.name("password2")).sendKeys("Sedt999.");
				 
				  //Click on register button
				  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]")).click();
				  
				  System.out.println(" valid username");
				  
				  Thread.sleep(1000);
				  
	}

}



				  

	



