package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.UtilityNeoStox;


public class NeoStoxBaseClass {
	protected static WebDriver driver;
	
	public void launchBrowser() throws IOException {
        //this neostox base class
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\SOFTWARE TESTING\\class notes\\chromedriver.exe");
	    
	    driver=new ChromeDriver();
	    driver.get(UtilityNeoStox.getDataFromPropertiesFile("url"));
	    driver.manage().window().maximize();
	    UtilityNeoStox.wait(driver, 1000);
	    Reporter.log("launching browser",true);
	}	
}
