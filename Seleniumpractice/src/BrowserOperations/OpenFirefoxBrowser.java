package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		String driverPath1="D:\\Class\\eclipse\\F1Javaworkspace\\Seleniumpractice\\Executable\\geckodriver-v0.30.0-win32\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",driverPath1);
		FirefoxDriver driver=new FirefoxDriver();
				

	}

}
