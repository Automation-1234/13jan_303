package day11aprilnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11april2 {

	public static void main(String[] args) {
		//open browser
				String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
				System.setProperty("webdriver.crome.driver", "driverPath");
				WebDriver driver=new ChromeDriver();
				//url
				driver.get("https://demo.actitime.com/login.do");
				
				
				//print title console
				System.out.println("Application page Title:"+driver.getTitle());
			   String expectedTitle="actiTIME=login";//login page verify
				String actualTitle=driver.getTitle();
		        
			int titleLength=driver.getTitle().length();	   
		   	System.out.println("length of the title is:"+titleLength);
           
		   	if(actualTitle.equals(expectedTitle))  {
				System.out.println("Login page open sucessfully");
			}else {
				System.out.println("either login page not opened or page title got changed..");
			}
		  //username field
		    WebElement userNameInputField=driver.findElement(By.id("username"));
		    userNameInputField.sendKeys("admin");
		    //remove
		    //userNameInputField.clear();
		    
		    WebElement passwordNameInputField=driver.findElement(By.name("pwd"));
		  passwordNameInputField.sendKeys("manager");
		    
		  WebElement loginButton=driver.findElement(By.id("loginButton"));
		   loginButton.click();
		   //pageurl
		   System.out.println("Current page url: " + driver.getCurrentUrl());
		   String actualUrl=driver.getCurrentUrl();
		  
		   }
		   
		   // driver.close();
	}

	


