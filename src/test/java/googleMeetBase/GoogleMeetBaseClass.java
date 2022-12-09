package googleMeetBase;

import java.io.IOException;

import javax.management.Notification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import neoStoxUtility.UtilityNeoStox;

public class GoogleMeetBaseClass {
ChromeOptions op=new ChromeOptions();
protected static WebDriver driver;
	
	public void launchBrowser() throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\SOFTWARE TESTING\\class notes\\chromedriver.exe");
	    op.addArguments("Incognito");
	   
	    driver=new ChromeDriver(op);
	    
	    driver.get("https://meet.google.com/");
	    
	    driver.manage().window().maximize();
	    
	    UtilityNeoStox.wait(driver, 1000);
	    
	    Reporter.log("launching browser",true);
	}	
}
