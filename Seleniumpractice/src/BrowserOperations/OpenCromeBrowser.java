package BrowserOperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCromeBrowser {

	public static void main(String[] args) {
		String driverPath1 ="D:\\Class\\eclipse\\F1Javaworkspace\\Seleniumpractice\\Executable\\chromedriver.exe";
		   //or
		String driverPath2="\\Executable\\chromedriver.exe";
		//or
		String driverPath3=	System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.crome.driver", "driverPath2");
		ChromeDriver cdriver=new ChromeDriver();//predefine classes so import

	}

}
