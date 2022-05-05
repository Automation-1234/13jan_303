package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		//open browser
				String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
				System.setProperty("webdriver.crome.driver", "driverPath");
				WebDriver driver=new ChromeDriver();
				//url
				driver.get("https://demo.vtiger.com/vtigercrm/index.php");
				driver.findElement(By.id("username")).clear();
				driver.findElement(By.id("username")).sendKeys("admin");
				driver.findElement(By.id("password")).clear();
				driver.findElement(By.id("password")).sendKeys("Test@123");
			 	 WebElement SigninButton=driver.findElement(By.linkText("Sign in"));
		    	SigninButton.click();
	}

}
