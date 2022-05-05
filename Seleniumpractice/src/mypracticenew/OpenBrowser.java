package mypracticenew;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
	String driverPath1="D:\\Class\\eclipse\\F1Javaworkspace\\Seleniumpractice\\Executable\\chromedriver.exe";
	String driverPath2=".\\Executable\\\\chromedriver.exe";
	String driverPath3=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath3);
	ChromeDriver cdriver=new ChromeDriver();
	}

}
