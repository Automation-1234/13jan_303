package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       driver.get("https://demo.actitime.com/");
	       
	     
	       System.out.println("Application current Title:"+driver.getTitle());
	      
	       String title=driver.getTitle();
	    	int titleLength=driver.getTitle().length();	   
	    	System.out.println("length of the title is:"+titleLength);
	       System.out.println("Application Source code:"+driver.getPageSource());
	       String SourceCode=driver.getPageSource();
	    		System.out.println("Source code length:"+SourceCode.length());   
	    		driver.close();
	}

}
