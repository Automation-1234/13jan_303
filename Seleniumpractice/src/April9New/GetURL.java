package April9New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL {

	public static void main(String[] args) {
		//open browser
		System.getProperty("webdriver.chrome.driver","\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//enter URl
		driver.get("https://www.google.com/");
		//get currentURL
		System.out.println("Application current URL:"+driver.getCurrentUrl());
		//get currentpage title
		System.out.println("Application page title:"+driver.getTitle());
		//getpagesource
		System.out.println("Application page source:"+driver.getPageSource());
//		//get page source length
		String sourcecode=driver.getPageSource();
		System.out.println("Application page source length"+sourcecode.length());
		

	}

}
