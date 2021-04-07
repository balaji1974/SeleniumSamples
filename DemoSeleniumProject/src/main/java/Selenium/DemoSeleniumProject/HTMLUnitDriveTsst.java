package Selenium.DemoSeleniumProject;



import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HTMLUnitDriveTsst {

	public static void main(String[] args) throws Exception {
		//java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
	    
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		driver.get("http://alsalam.aero");
		System.out.println("Browser version is: "+driver.getBrowserVersion());
		System.out.println("Title is :"+driver.getTitle());
  
  		driver.quit();
		 	 
	}
}
