package April11new;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",driverPath);	
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        cdriver.get("https://www.facebook.com");
        
        System.out.println("Application page Title:"+cdriver.getTitle());
        WebDriverWait wait=new   WebDriverWait(cdriver,20);
        String actualHomePageTitle=cdriver.getTitle();
		   System.out.println("Actual HomePageTitle:"+actualHomePageTitle);
		   String expectedHomePageTitle="Facebook-log in or sign up";
		   if(actualHomePageTitle.equals(expectedHomePageTitle))  {
	        	System.out.println("Homepage is open sucessfully..");
	        }else {
	        	System.out.println(" is not open....");
	        	
	}
		 //  cdriver.close();
		  
	}
}
