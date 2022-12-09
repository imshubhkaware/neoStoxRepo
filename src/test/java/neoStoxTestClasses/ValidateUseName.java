package neoStoxTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoPOMClasses.NeoStoxHomePage;
import neoPOMClasses.NeoStoxPasswordPage;
import neoPOMClasses.NeoStoxSignUp;
import neoStoxBase.NeoStoxBaseClass;
import neoStoxUtility.UtilityNeoStox;

public class ValidateUseName extends NeoStoxBaseClass {
	NeoStoxSignUp signUp;
	NeoStoxPasswordPage password;
	NeoStoxHomePage home;
	
	@BeforeClass
	public void launchNeoStox() throws IOException {
		launchBrowser();
		signUp=new NeoStoxSignUp(driver);
		password=new NeoStoxPasswordPage(driver);
		home=new NeoStoxHomePage(driver);
		
	}
	@BeforeMethod
	public void loginToNeoStox() throws IOException, InterruptedException {
		signUp.enterMobileNumber(driver, UtilityNeoStox.getDataFromPropertiesFile("mobileNo"));
	    signUp.clickOnSignUpButton(driver);
	    password.enterPassword(driver, UtilityNeoStox.getDataFromPropertiesFile("password"));
	    password.clickOnSubmitButton(driver);
	    Thread.sleep(1000);
	    home.handlePopUp(driver);
	    
	}
	@Test(priority = -1)
  public void validateUserName() throws IOException {
		Assert.assertEquals(home.getActualUserName(),UtilityNeoStox.getDataFromPropertiesFile("expectedUserName"),"TC failed actual and Expected usename are not matching");
  
	}
	@Test
	  public void validateBalance() throws IOException {
			Assert.assertEquals(home.getBalance(),UtilityNeoStox.getDataFromPropertiesFile("balance"),"TC failed actual and Expected funds are not matching");
	  
		}
	@AfterMethod
	public void logoutFromApplication() {
		home.logOutFromAplication(driver);
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
