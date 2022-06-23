package Assingments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseoperations {
	 private static final String ConfirmationText = null;

		
	 
	public static void main(String[] args){

		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  String URL="http://automationpractice.com/index.php";
		  
		  // Open URL and Maximize browser window
		  driver.get(URL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//Click on Women
		  driver.findElement(By.linkText("WOMEN")).click();
		  
		  
		
		  WebElement FirstImg=driver.findElement(By.xpath(" /html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
		  
		  WebElement MoreBtn=driver.findElement(By.xpath(" /html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]"));
		  
		  Actions actions=new Actions(driver);
		  actions.moveToElement(FirstImg).moveToElement(MoreBtn).click().perform();
		//Click on add to cart
		  driver.findElement(By.xpath("//product1[@id='add_to_cart']//span[.='Add to cart']")).click();
		//Click on proceed
		  
		  driver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")).click();
		  //Click on checkout
		 driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		  
		  
		// Verify that Product is ordered
		  /*if(ConfirmationText.contains("complete")) {
		   System.out.println("Order Completed: Test Case Passed");
		  }
		  else{
			   System.out.println("Results NotMatched;Test Case Failed");
			  }*/
		  driver.close();
		  driver.quit();
	}
}
	