package neoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityNeoStox {

	 public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException {
		    
	    	File myFile= new File("C:\\Users\\user\\Documents\\SOFTWARE TESTING\\class notes\\MockGroup2.xlsx");
	    		    org.apache.poi.ss.usermodel.Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
	    			String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	    			return value;
	    	 }
	    public static void ScreenShotMethod(WebDriver driver, String TCID) throws IOException {
			
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String str = RandomString.make(3);
			
			File destination= new File("C:\\program ss\\"+TCID+".jpeg");
			
			
			FileHandler.copy(source, destination);
			
		}
	    public static void wait(WebDriver driver, int waitTime)
	{
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));

	}
	    public static void scrollIntoView(WebDriver driver,WebElement element)
	    {
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].scrollIntoView()", element);
	    }
     public static String getDataFromPropertiesFile(String key) throws IOException {
			Properties prop=new Properties();
			FileInputStream myFile=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\AutomationClassSelenium\\neoStox.properties");
     	prop.load(myFile);
     	String value = prop.getProperty(key);
     	return value;
     	
     }
}
