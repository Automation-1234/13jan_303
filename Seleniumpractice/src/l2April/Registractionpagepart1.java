package l2April;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registractionpagepart1 {


	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.crome.driver", "driverPath");
		WebDriver driver=new ChromeDriver();
		//url
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.saucedemo.com/");
				
	String expectedTitle="Swag Labs";//login page verify
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))  {
			System.out.println("Login page open sucessfully");
		}else {
			System.out.println("either login page not opened or page title got changed..");
		}
		//url
		driver.get("https://www.saucedemo.com/");
		WebElement usernameInputField=driver.findElement(By.id("user-name"));
		usernameInputField.sendKeys("standard_user");
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		WebElement logoutButton=driver.findElement(By.id("logout_sidebar_link"));
		//explicitway
		WebDriverWait wait=new WebDriverWait(driver,20);
        String atualHomePageTitle=driver.getTitle();
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		
		System.out.println("Actual Home Page title:" + atualHomePageTitle);
		String expectedHomePageTitle="Swag Labs ";
		if(expectedHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("login is successfull and home page title verifyed");
		}else {
			System.out.println("login is failed and home page title is changed");
		
		}
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
}

