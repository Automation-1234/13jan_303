package day11aprilnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11april {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    //url
	    driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	    //login page verify
	    String expectedTitle="vtiger  - Login";
	    String actualTitle=driver.getTitle();
	    if(actualTitle.equals(expectedTitle))  {
	    	System.out.println("login page open succesfully...");
	    }else {
	    	System.out.println("login page are not opened");
	    }
      //username field
	    WebElement userNameInputField=driver.findElement(By.id("username"));
	    userNameInputField.clear();
	    userNameInputField.sendKeys("admin");
	    //remove
	    //userNameInputField.clear();
	    
	    WebElement passwordNameInputField=driver.findElement(By.name("password"));
	    passwordNameInputField.clear();
	  passwordNameInputField.sendKeys("Test@123");
	    
	  WebElement loginButton=driver.findElement(By.className("buttonBlue"));
	   loginButton.click();

	}

}
