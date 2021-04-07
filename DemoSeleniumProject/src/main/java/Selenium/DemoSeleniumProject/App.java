package Selenium.DemoSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Selenium Testing
 *
 */
public class App {
	private static final String browserName="Chrome";
	private static WebDriver driver;

	public static void main( String[] args ) {
		setBrowserClass();
		runTest();
	}

	private static void setBrowserClass() {
		if(browserName.equalsIgnoreCase("Chrome")) 
			driver=new ChromeDriver();
		if(browserName.equalsIgnoreCase("Safari")) 		  
			driver=new SafariDriver();
	}

	private static void runTest() {
		driver.get("http://alsalam.aero"); 
		driver.close();

	}

}
