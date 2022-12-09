package googleMeetPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityNeoStox;

public class GoogleMeetMeetingPage {
 
	@FindBy(xpath="(//i[@class='google-material-icons VfPpkd-kBDsod'])[9]")private WebElement meetingLinkClosePopUp;
    @FindBy(xpath="(//button[@jsname='BOHaEe'][1])")private WebElement microphoneButton;
    @FindBy(xpath="//button[@jsname='BOHaEe'][2])")private WebElement cameraButton;
    @FindBy(xpath="(//i[@class='google-material-icons VfPpkd-kBDsod NtU4hc'])[3]")private WebElement chatBoxOption;
    @FindBy(xpath="//textarea[@aria-label='Send a message to everyone']")private WebElement chatBoxField;
    @FindBy(xpath="//button[@class='VfPpkd-Bz112c-LgbsSe yHy1rc eT1oJ QDwDD tWDL4c  Cs0vCd']")private WebElement msgSendButton;

    public GoogleMeetMeetingPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickOnCloseMeetingLinkButton(WebDriver driver) {
    	UtilityNeoStox.wait(driver, 5000);
    	meetingLinkClosePopUp.click();
    	Reporter.log("clossing new meeting link popup", true);
    }
    public void clickOnMicrophoneButton(WebDriver driver) {
    	UtilityNeoStox.wait(driver, 1000);
    	microphoneButton.click();
    	Reporter.log("turn off microphone", true);
    }
    public void clickOnCameraButton(WebDriver driver) {
    	UtilityNeoStox.wait(driver, 1000);
    	cameraButton.click();
    	Reporter.log("turn off camera", true);
    }
    public void clickOnChatBoxOption(WebDriver driver) {
    	UtilityNeoStox.wait(driver, 1000);
    	chatBoxOption.click();
    	Reporter.log("clicking on chat box option", true);
    }
    public void writingMsgInChatBoxField(WebDriver driver) {
    	UtilityNeoStox.wait(driver, 1000);
    	chatBoxField.click();
    	chatBoxField.sendKeys("hello good morning all");
    	Reporter.log("clicking on ChatBox Field", true);
    }
    public void sendingMsg(WebDriver driver) {
    	UtilityNeoStox.wait(driver, 1000);
    	msgSendButton.click();
    	Reporter.log("clicking on send button", true);
    }
    

}
