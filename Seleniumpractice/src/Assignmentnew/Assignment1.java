package Assignmentnew;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	private static By demo;

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.crome.driver", "driverPath");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//url
		driver.get("https://www.flipkart.com");
//		  String expectedTitle="Flipkart-login";//login page verify
//			String actualTitle=driver.getTitle();
//	        	if(actualTitle.equals(expectedTitle))  {
//			System.out.println("Login page open sucessfully");
//		}else {
//			System.out.println("either login page not opened or page title got changed..");
			
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		 // wait.until(ExpectedConditions.elementToBeClickable(logoutlink));
		   String actualHomePageTitle=driver.getTitle();
		   System.out.println("Actual HomePageTitle:"+actualHomePageTitle);
	 String expectedHomePageTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		   if( actualHomePageTitle.equals( expectedHomePageTitle))  {
			   System.out.println("login is sucessful..");
		   }else {
			   System.out.println("login is failed or home page title is changed");
			  
			//WebElement TopOffers=driver.findElement(By.id("container"));
		     List<WebElement> name=driver.findElements( By.id("container"));
		     
		     System.out.println(name.size());
		     WebElement cat=name.get(0);
		     for(int i=0;i<name.size();i++)  {
		     WebElement print=name.get(i);
		     System.out.println(print.getText());
		     
		     
			   //driver.findElement(By.id("logoutLink")).click();

	}

	}
	}

}