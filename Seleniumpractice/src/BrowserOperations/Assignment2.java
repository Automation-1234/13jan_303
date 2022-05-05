package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.google.com");
        
	       System.out.println("Application current URL:"+driver.getCurrentUrl());
	       System.out.println("Application source code :"+driver.getPageSource());  
	      String PageSource=driver.getPageSource();
      // PageSource Length=PageSource.length();
       System.out.println("Length of page source current page is:"+PageSource.length());
       driver.close();
	}

}
