package mypracticenew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openmultybrowser {

	public static void main(String[] args) {
		String geckodriverPath=System.getProperty("user.dir")+"\\Executable\\geckodriver-v0.30.0-win32\\geckodriver.ex";
		 String chromedriverPath1=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		
		OpenBrowser(geckodriverPath,"Firefox");
	}
		 static void OpenBrowser(String driverpath,String BrowserName) {
		if( BrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.Chrome.driver",driverpath);
			WebDriver driver=new ChromeDriver();
		}else if ( BrowserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",driverpath);
			WebDriver driver=new FirefoxDriver();
		}
		 
	}

}
