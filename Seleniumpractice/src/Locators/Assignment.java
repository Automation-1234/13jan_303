package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;



public class Assignment {

	public static void main(String[] args) {
		//open browser
		System.setProperty("webdriver.gecko.driver", ".\\Executable\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
        //url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	
		String expectedTitle="vtiger - Login";//login page verify
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))  {
			System.out.println("Login page open sucessfully");
		}else {
			System.out.println("either login page not opened or page title got changed..");
			driver.findElement(By.id("username")).clear();
			WebElement usernameInputField=driver.findElement(By.id("username"));
	    	usernameInputField.sendKeys("admin"); 	
	
	    	driver.findElement(By.id("password")).clear();
		WebElement passwordInputField=driver.findElement(By.id("password"));
    	passwordInputField.sendKeys("Test@123"); 	
    	driver.findElement(By.className("buttonBlue")).click();
			
			
		  	
	}

}
}

	