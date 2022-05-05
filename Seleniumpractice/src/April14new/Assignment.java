package April14new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",driverPath);	
		WebDriver cdriver=new ChromeDriver();
        cdriver.get("https://www.demoblaze.com");
        
	}

}
