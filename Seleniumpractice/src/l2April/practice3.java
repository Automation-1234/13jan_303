package l2April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice3 {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","./executable/chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	  
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("Test@123");
	driver.findElement(By.className("buttonBlue")).click();
//	driver.findElement(By.className("fa-user")).click();
//	driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).clear();

	}

}
