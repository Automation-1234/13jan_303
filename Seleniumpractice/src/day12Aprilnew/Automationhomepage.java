package day12Aprilnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automationhomepage {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.crome.driver", "driverPath");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//url
		driver.get("https://demo.actitime.com/login.do");
		  String expectedTitle="actiTIME=login";//login page verify
			String actualTitle=driver.getTitle();
	        	if(actualTitle.equals(expectedTitle))  {
			System.out.println("Login page open sucessfully");
		}else {
			System.out.println("either login page not opened or page title got changed..");
			
			 WebElement userNameInputField=driver.findElement(By.id("username"));
			    userNameInputField.sendKeys("admin");
			    //remove
			    //userNameInputField.clear();
			    
			    WebElement passwordNameInputField=driver.findElement(By.name("pwd"));
			  passwordNameInputField.sendKeys("manager");
			    
			  WebElement loginButton=driver.findElement(By.id("loginButton"));
			   loginButton.click();
			  WebElement logoutButton= driver.findElement(By.id("logoutLink"));
			  
			  WebDriverWait wait=new WebDriverWait(driver,20);
			  wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
			   String actualHomePageTitle=driver.getTitle();
			   System.out.println("Actual HomePageTitle:"+actualHomePageTitle);
			   String expectedHomePageTitle="actiTIME  -  Enter Time-Track";
			   if( actualHomePageTitle.equals( expectedHomePageTitle))  {
				   System.out.println("login is sucessful..");
			   }else {
				   System.out.println("login is failed or home page title is changed");
				   
				   driver.findElement(By.id("logoutLink")).click();
			   }
		}
	}

}
