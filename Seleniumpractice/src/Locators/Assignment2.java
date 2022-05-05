package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		//open browser
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.crome.driver", "driverPath");
		WebDriver driver=new ChromeDriver();
		//url
		driver.get("https://demo.actitime.com/");
		String expectedTitle="actiTIME - Login";//login page verify
		String actualTitle=driver.getTitle();
        
	int titleLength=driver.getTitle().length();	   
   	System.out.println("length of the title is:"+titleLength);
    	
    //verify it is a page open or not
		if(actualTitle.equals(expectedTitle))  {
			System.out.println("Login page open sucessfully");
		}else {
			System.out.println("either login page not opened or page title got changed..");
		}
		//enter valid username & password
  	WebElement usernameInputField=driver.findElement(By.id("username"));
		usernameInputField.sendKeys("admin");
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
   	passwordInputField.sendKeys("manager");
    	//click login button
    driver.findElement(By.id("loginButton")).click();
    	//print thr title on the console
 	 String  actualTitle1= driver.getTitle();
       System.out.println("ActualTitle is:" +actualTitle1);
           System.out.println("Application current Title:"+driver.getTitle());
           driver.findElement(By.id("logoutLink")).click();
	}

	
	}




