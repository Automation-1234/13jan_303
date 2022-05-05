package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	public static void main(String[] args) {
		//open browser
		System.setProperty("webdriver.gecko.driver", ".\\Executable\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		//url
			driver.get("https://demosite.executeautomation.com/Login.html");
			
			System.out.println("Application page Title:"+driver.getTitle());
		      
			String expectedTitle="Execute Automation Test Site=login";//login page verify
			String actualTitle=driver.getTitle();
	        //title length
			int titleLength=driver.getTitle().length();	   
	    	System.out.println("length of the title is:"+titleLength);
	    	
	    	  //verify it is a page open or not
			if(actualTitle.equals(expectedTitle))  {
				System.out.println("Login page open sucessfully");
			}else {
				System.out.println("either login page not opened or page title got changed..");
	    
				WebElement UserNameInputField=driver.findElement(By.name("UserName"));
			UserNameInputField.sendKeys("execution");
				
			WebElement PasswordInputField=driver.findElement(By.name("Password"));
		    	PasswordInputField.sendKeys("admin");
		    	
		    	 driver.findElement( By.name("login")).click(); 
		    	
	}

}

	private static By Byname(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}

