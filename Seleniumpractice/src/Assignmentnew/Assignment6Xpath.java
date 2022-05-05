package Assignmentnew;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6Xpath {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.crome.driver", "driverPath");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//url
		driver.get("https://www.flipkart.com");
	    List<WebElement> TopOffers=driver.findElements( By.xpath("//div[@class=\"_37M3Pb\"]"));
		System.out.println("option count is:"+TopOffers.size());
		for(int i=0;i<TopOffers.size();i++) {
		
		WebElement top= TopOffers.get(i);
		System.out.println("first element of list is:"+top.getText());
		//System.out.println(top.getText().equals("Top Offers"));
		System.out.println(TopOffers.get(i).getText());

	}
	}
}
