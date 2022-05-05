package day11.testNGsamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7 {
   @Test
   public void loginInActitimeApplication()  {
	   String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",driverPath);	
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get("https://demo.actitime.com/login.do");
       System.out.println("Before login page title:"+driver.getTitle());
       //validation usingTestNG 
       Assert.assertEquals(driver.getTitle(),"actiTIME - Login");
      driver.findElement(By.id("username")).sendKeys("admin");
      
      driver.findElement(By.name("pwd")).sendKeys("manager");
      
      driver.findElement(By.id("loginButton")).click();
      
      WebElement logoutBtn=driver.findElement(By.linkText("Logout"));
      
      WebDriverWait wait=new  WebDriverWait(driver,20);
      wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
      
      System.out.println("After login page Title:"+driver.getTitle());
      logoutBtn.click();
      driver.close();
}
}