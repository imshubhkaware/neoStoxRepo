package neoStoxTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoPOMClasses.NeoStoxHomePage;
import neoPOMClasses.NeoStoxNeoScreenerPage;
import neoPOMClasses.NeoStoxPasswordPage;
import neoPOMClasses.NeoStoxSignUp;
import neoStoxBase.NeoStoxBaseClass;
import neoStoxUtility.UtilityNeoStox;

public class ValidateNeoScreenerTab extends NeoStoxBaseClass {
	NeoStoxSignUp signUp;
	NeoStoxPasswordPage password;
	NeoStoxHomePage home;
	NeoStoxNeoScreenerPage screener;
	@BeforeClass
	public void launchNeoStox() throws IOException {
		launchBrowser();
		signUp=new NeoStoxSignUp(driver);
		password=new NeoStoxPasswordPage(driver);
		home=new NeoStoxHomePage(driver);
		screener=new NeoStoxNeoScreenerPage(driver);
	}
	@BeforeMethod
	public void loginToNeoStox() throws IOException, InterruptedException {
		signUp.enterMobileNumber(driver, UtilityNeoStox.getDataFromPropertiesFile("mobileNo"));
	    signUp.clickOnSignUpButton(driver);
	    password.enterPassword(driver, UtilityNeoStox.getDataFromPropertiesFile("password"));
	    password.clickOnSubmitButton(driver);
	    Thread.sleep(1000);
	    home.handlePopUp(driver);
	    home.clickOnNeoScreenerOption(driver);
	    
	}
	@Test
  public void validateNeoScreenerTabs() throws IOException {
		
		screener.ClickOnAllAcrossTab(driver);
		screener.ClickOnEquitiesTab(driver);
		screener.ClickOnFuturesTab(driver);
		screener.ClickOnOptionsTab(driver);
		screener.ClickOnMcxFutureTab(driver);
		screener.ClickOnMcxOptionTab(driver);
		screener.ClickOnGainersLoosersDropDown(driver);
		screener.ClickOnNiftyCheckBox(driver);
		screener.ClickOnBankNiftyCheckBox(driver);
		Reporter.log("screeners all tab are cleckable", true);
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
