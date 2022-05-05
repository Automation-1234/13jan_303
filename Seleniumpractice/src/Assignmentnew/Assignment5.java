package Assignmentnew;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5 {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.crome.driver", "driverPath");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//url
		driver.get("https://www.gsmarena.com");
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		 // wait.until(ExpectedConditions.elementToBeClickable(logoutlink));
		   String actualHomePageTitle=driver.getTitle();
		   System.out.println("Actual HomePageTitle:"+actualHomePageTitle);
	 String expectedHomePageTitle="GSMArena.com - mobile phone reviews, news, specifications and more...";
		   if( actualHomePageTitle.equals( expectedHomePageTitle))  {
			   System.out.println("login is sucessful..");
		   }else {
			   System.out.println("login is failed or home page title is changed");
			   List<WebElement>HOME=driver.findElements( By.xpath("//ul[@class='main-menu-list open']/li[1]"));
			   System.out.println("option count is:"+HOME.size());
			   
			   List<WebElement>NEWS=driver.findElements( By.xpath("//ul[@class='main-menu-list open']/li[2]"));
			   System.out.println("option count is:"+NEWS.size());
			   
				for(int i=0;i<HOME.size();i++) {
			   WebElement top= HOME.get(i);
				System.out.println("first element of list is:"+top.getText());
				//System.out.println(top.getText().equals("Top Offers"));
				System.out.println( HOME.get(i).getText());
	}
	}
	}
}

