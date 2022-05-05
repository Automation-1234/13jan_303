package day11aprilnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsnew {

	public static void main(String[] args) {
		//open browser
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
	    WebDriver driver=new ChromeDriver();
	    //url
	    driver.get("https://demo.actitime.com/login.do");
	    //login page verify
	    String expectedTitle="actiTIME =Login";
	    String actualTitle=driver.getTitle();
	    if(actualTitle.equals(expectedTitle))  {
	    	System.out.println("login page open succesfully...");
	    }else {
	    	System.out.println("login page are not opened");
	    }
      //username field
	    WebElement userNameInputField=driver.findElement(By.id("username"));
	    userNameInputField.sendKeys("admin");
	    //remove
	    userNameInputField.clear();
	    
	    WebElement passwordNameInputField=driver.findElement(By.name("pwd"));
	  passwordNameInputField.sendKeys("manager");
	    
	  WebElement loginButton=driver.findElement(By.id("loginButton"));
	   loginButton.click();
	    
	}

}
