package April12new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe"; 
	System.setProperty("webdriver.chrome.driver",driverPath);	
	WebDriver cdriver=new ChromeDriver();
    cdriver.get("https://demo.vtiger.com/vtigercrm/index.php");	

   
    WebElement usernamefield=cdriver.findElement(By.id("username"));
    usernamefield.clear();
    usernamefield.sendKeys("admin");
    WebElement passwordamefield=cdriver.findElement(By.id("password"));
    passwordamefield.clear();
    passwordamefield.sendKeys("Test@123");

    WebElement loginButton=cdriver.findElement(By.className("button"));
    loginButton.click();
    
   WebElement logoutButton=cdriver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
   logoutButton.click();
//   
	}

}
