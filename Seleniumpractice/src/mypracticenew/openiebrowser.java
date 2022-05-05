package mypracticenew;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class openiebrowser {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+" http://selenium-release.storage.googleapis.com/index.html";
				System.setProperty("webdriver.ie.driver",driverPath);
				InternetExplorerDriver idriver=new InternetExplorerDriver();

	}

}
