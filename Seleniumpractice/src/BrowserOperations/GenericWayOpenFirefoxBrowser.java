package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayOpenFirefoxBrowser {

	public static void main(String[] args) {
		String driverPath="D:\\Class\\eclipse\\F1Javaworkspace\\Seleniumpractice\\Executable\\geckodriver-v0.30.0-win32\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",driverPath);
            WebDriver cdriver=new FirefoxDriver();
				

	}

}