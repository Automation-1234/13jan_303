package day12Aprilnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteAutomation {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.crome.driver", "driverPath");
		WebDriver driver=new ChromeDriver();
		//url
		driver.get("https://www.saucedemo.com/");
		WebElement userNameInputField=driver.findElement(By.id("user-name"));
		 userNameInputField.sendKeys("standard_user");
		 
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 WebElement loginButon=driver.findElement(By.name("login-button"));
		 driver.findElement( By.name("login-button")).click();
		
	}

}
