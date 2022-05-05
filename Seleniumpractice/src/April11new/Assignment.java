package April11new;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) throws InterruptedException  {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",driverPath);	
		WebDriver cdriver=new ChromeDriver();
        cdriver.get("https://demo.actitime.com/");
        //get page title and title length
        System.out.println("Application page Title:"+cdriver.getTitle());
        String PageTitle=cdriver.getTitle();
        System.out.println("page title length:"+PageTitle.length());
        //get page URL
        cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String expectedURl="https://demo.actitime.com/";
        String actualURl=cdriver.getCurrentUrl();
        if(actualURl.equals( expectedURl))  {
        	System.out.println("URl is open sucessfully..");
        }else {
        	System.out.println("URl is not open....");
        	
        }
        WebElement usernamefield=cdriver.findElement(By.id("username"));
        usernamefield.sendKeys("admin");
        WebElement passwordamefield=cdriver.findElement(By.name("pwd"));
        passwordamefield.sendKeys("manager");

        WebElement loginButton=cdriver.findElement(By.id("loginButton"));
        loginButton.click();
       
        WebDriverWait wait=new WebDriverWait(cdriver,20);
		 wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		Thread.sleep(2000);
		String actualHomePageTitle=cdriver.getTitle();
		   System.out.println("Actual HomePageTitle:"+actualHomePageTitle);
		   String expectedHomePageTitle="actiTIME  -  Enter Time-Track";
		   if( actualHomePageTitle.equals( expectedHomePageTitle))  {
			   System.out.println("login is sucessful..");
		   }else {
			   System.out.println("login is failed or home page title is changed");
			   
//		
	}
		 //  cdriver.findElement(By.id("logoutLink")).click();
	}
}

