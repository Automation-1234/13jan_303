package mypracticenew;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openfirefoxbrowser {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\geckodriver-v0.30.0-win32\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",driverPath);
		FirefoxDriver fdriver= new FirefoxDriver();
	}

}
