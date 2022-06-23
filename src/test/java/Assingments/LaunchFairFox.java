package Assingments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFairFox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.mozilla.org/en-US/firefox/");
		//Navigate the URL
				driver.navigate().to("https://dsportalapp.herokuapp.com/");
				
				Dimension d = new Dimension(800,600);
				//Resize current window to the set dimension
				driver.manage().window().setSize(d);
				
				//Maximize browser window
				driver.manage().window().maximize();
				
				//Navigate page to backward
						driver.navigate().back();
						Thread.sleep(3000);
						//navigate page to forward
				driver.navigate().forward();
				Thread.sleep(3000);
				//Refresh page
				driver.navigate().refresh();
				
				//To Delay execution for 20 sec.as to view the resize browser
				Thread.sleep(2000);
				//Close the browser
				driver.close();


}

}
