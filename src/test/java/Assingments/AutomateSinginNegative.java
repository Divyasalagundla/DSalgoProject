package Assingments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Invalid Username Test

public class AutomateSinginNegative {
	
	public static void main(String[]args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
			driver.get("https://google.com");
			//Navigate the URL
			driver.navigate().to("https://dsportalapp.herokuapp.com/");
			//Maximize browser window
			driver.manage().window().maximize();
			//Click on Get Start
			  driver.findElement(By.linkText("Get Started")).click();
			  driver.findElement(By.linkText("Sign in")).click();
			//Enter email address
			  driver.findElement(By.name("username")).sendKeys("Sdivya");
			  driver.findElement(By.name("password")).sendKeys("Sedt999/");
			  
			  driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			  
	System.out.println("Invalid Username");
}



	//Invalid Password Test
public static void main1(String[]args) {
	
 WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

	driver.get("https://google.com");
	//Navigate the URL
	driver.navigate().to("https://dsportalapp.herokuapp.com/");
	//Maximize browser window
	driver.manage().window().maximize();
	//Click on Get Start
	  driver.findElement(By.linkText("Get Started")).click();
	  driver.findElement(By.linkText("Sign in")).click();
	//Enter email address
	  driver.findElement(By.name("username")).sendKeys("Sdivya28");
	  driver.findElement(By.name("password")).sendKeys("Sdet999/");
	  
	  driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	  
System.out.println("Invalid Password");
}



//Invalid Username and Password Test

public static void main2(String[]args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
			driver.get("https://google.com");
			//Navigate the URL
			driver.navigate().to("https://dsportalapp.herokuapp.com/");
			//Maximize browser window
			driver.manage().window().maximize();
			//Click on Get Start
			  driver.findElement(By.linkText("Get Started")).click();
			  driver.findElement(By.linkText("Sign in")).click();
			//Enter email address
			  driver.findElement(By.name("username")).sendKeys("Sdivya");
			  driver.findElement(By.name("password")).sendKeys("Sdet999/");
			  
			  driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			  
	System.out.println("Invalid Username and Password");
	
	driver.close();
}
   
}

