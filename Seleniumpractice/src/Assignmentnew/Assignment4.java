package Assignmentnew;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.crome.driver", "driverPath");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//url
		driver.get("https://www.cricinfo.com");
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		 // wait.until(ExpectedConditions.elementToBeClickable(logoutlink));
		   String actualHomePageTitle=driver.getTitle();
		   System.out.println("Actual HomePageTitle:"+actualHomePageTitle);
	 String expectedHomePageTitle="Live cricket scores, match schedules, latest cricket news, cricket videos";
		   if( actualHomePageTitle.equals( expectedHomePageTitle))  {
			   System.out.println("login is sucessful..");
		   }else {
			   System.out.println("login is failed or home page title is changed");
//			   List<WebElement> TopOffers=driver.findElements( By.cssSelector("._37M3Pb>div>a"));
//				System.out.println("option count is:"+TopOffers.size());
//				for(int i=0;i<TopOffers.size();i++) {
//				
//				WebElement top= TopOffers.get(i);
//				System.out.println("first element of list is:"+top.getText());
//				//System.out.println(top.getText().equals("Top Offers"));
//				System.out.println(TopOffers.get(i).getText());  

	}
	}

}
