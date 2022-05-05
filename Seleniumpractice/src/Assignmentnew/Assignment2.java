package Assignmentnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
	
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.crome.driver", "driverPath");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//url
		driver.get("https://www.demoblaze.com/");
		WebElement categories=driver.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
		System.out.println(categories.getText().equals("CATEGORIES"));
		WebElement phones=driver.findElement(By.cssSelector(".list-group>*:nth-child(2)"));
		System.out.println(phones.getText().equals("Phones"));

	}

}
