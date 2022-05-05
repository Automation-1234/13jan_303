package day11aprilnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment11april3 {

	public static void main(String[] args) {
		//launch browser
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.crome.driver", "driverPath");
		WebDriver driver=new ChromeDriver();
		//
		driver.get("https://demosite.executeautomation.com/Login.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 System.out.println("Current page url: " + driver.getCurrentUrl());
		   String actualUrl=driver.getCurrentUrl();
		
		 System.out.println("Application page Title:"+driver.getTitle());
		   String expectedTitle="Execute Automation";//login page verify
			String actualTitle=driver.getTitle();
	        
		int titleLength=driver.getTitle().length();	   
	   	System.out.println("length of the title is:"+titleLength);
	   	
	    //username field
	    WebElement userNameInputField=driver.findElement(By.name("UserName"));
	    userNameInputField.sendKeys("execution");
	    //remove
	    //userNameInputField.clear();
	    
	    WebElement passwordNameInputField=driver.findElement(By.name("Password"));
	  passwordNameInputField.sendKeys("admin");
	  driver.findElement( By.name("Login")).click();
	}

}
