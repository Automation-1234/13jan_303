package April9New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirebox {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\geckodriver-v0.30.0-win32\\geckodriver.exe";
				System.setProperty("webdriver.gecko.driver",driverPath);
		WebDriver driver=new FirefoxDriver();

	}

}
