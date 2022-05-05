package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com");
       
       
       System.out.println("Application Source code:"+driver.getPageSource());
       String SourceCode=driver.getPageSource();
//    		System.out.println("Source code length:"+SourceCode.length());   
//       System.out.println("Application current URL:"+driver.getCurrentUrl());
//       System.out.println("Application current Title:"+driver.getTitle());
//       System.out.println("Application source code :"+driver.getPageSource());  
//       driver.close();
	}

}
