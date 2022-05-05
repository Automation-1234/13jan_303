package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actimelogin {

	public static void main(String[] args) {
		//open chrome browser
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.crome.driver", "driverPath");
		WebDriver driver=new ChromeDriver();
		//enter URL
		driver.get("https://demo.actitime.com/login.do");
		String expectedTitle="actiTIME =Login";//login page verify
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))  {
			System.out.println("Login page open sucessfully");
		}else {
			System.out.println("either login page not opened or page title got changed..");
		}
		//identify username field
		WebElement usernameInputField=driver.findElement(By.id("username"));
		usernameInputField.sendKeys("admin");
		//remove
		usernameInputField.clear();
		usernameInputField .sendKeys("admin");
		//orpassword
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
    	passwordInputField.sendKeys("manager");
    	usernameInputField.clear();
		usernameInputField .sendKeys("manager");
    	//login button
   	WebElement loginButton=driver.findElement(By.id("loginButton"));
    	loginButton.click();
    	//driver.close();
	}

}
