package googleMeetTestClasses;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import googleMeetBase.GoogleMeetBaseClass;
import googleMeetPOMClasses.GoogleMeetHomePage;
import googleMeetPOMClasses.GoogleMeetMeetingPage;
import neoPOMClasses.NeoStoxHomePage;
import neoPOMClasses.NeoStoxPasswordPage;
import neoPOMClasses.NeoStoxSignUp;
import neoStoxUtility.UtilityNeoStox;

public class ValidateGMeetCamMicrophone extends GoogleMeetBaseClass {
	GoogleMeetHomePage home;
	GoogleMeetMeetingPage meet;
	
	@BeforeClass
	public void launchGoogleMeet() throws IOException {
		launchBrowser();
		home=new GoogleMeetHomePage(driver);
		meet=new GoogleMeetMeetingPage(driver);
		
	}
	@BeforeMethod
	public void createGoogleMeeting() throws IOException, InterruptedException {
		home.clickOnNewMeetingButton(driver);
		home.clickOnStartAnInstantMeetingButton(driver);
	    
	}
	@Test
  public void validateMicrophone() throws IOException {
		meet.clickOnMicrophoneButton(driver);
		Reporter.log("user succesfully able to mute/unmute mic", true);
	}
	@Test
	  public void validateCamera() throws IOException {
			meet.clickOnCameraButton(driver);
			Reporter.log("user succesfully able to turn on/off camera", true);
		}
	@Test
	public void validateTextField() {
		meet.clickOnChatBoxOption(driver);
		meet.writingMsgInChatBoxField(driver);
		meet.sendingMsg(driver);
		Reporter.log("user succesfully able to send msg in meeting", true);
		
	}
	@AfterMethod
	public void meeting() {
		home.clickOnMeetingEndButton(driver);
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
