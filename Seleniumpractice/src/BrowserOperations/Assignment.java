package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Executable\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
	       driver.get("https://www.facebook.com");  
	     String  actualTitle= driver.getTitle();
	       System.out.println("ActualTitle is:" +actualTitle);
	       
	       System.out.println("Application current Title:"+driver.getTitle());
	       driver.close();
	}

}
