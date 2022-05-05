package l3April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.crome.driver", "driverPath");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//identify the required element from the UI and perform reqiored action 0-30
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//identify the required element from the UI and perform reqiored action
		driver.findElement(By.id("btnLogin")).click(); //0-30
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
	}

}
