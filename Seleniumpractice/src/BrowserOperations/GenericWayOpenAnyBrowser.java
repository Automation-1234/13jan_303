package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayOpenAnyBrowser {

	public static void main(String[] args) {
		String geckodriverPath=System.getProperty("user.dir")+"\\Executable\\geckodriver-v0.30.0-win32\\geckodriver.exe";
	       String ChromeDriverPath = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
	     //  openBrowser( ChromeDriverPath,"Chrome");
	       openBrowser( ChromeDriverPath,"Firefox");
	}
     static void openBrowser(String driverPath,String BrowserName ) {
    	 if(BrowserName.equalsIgnoreCase("Chrome")) {
    		 System.setProperty("webdriver.crome.driver", "driverPath");
    			WebDriver Cddriver=new ChromeDriver();
    	 }else if (BrowserName.equalsIgnoreCase("Firefox")){ 
    		 System.setProperty("webdriver.gecko.driver", "driverPath");
 			WebDriver Cddriver=new FirefoxDriver(); 
    		 
    	 }
    	 
     }
}
