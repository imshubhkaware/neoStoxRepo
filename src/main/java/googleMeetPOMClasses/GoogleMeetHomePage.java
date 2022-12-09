package googleMeetPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityNeoStox;

public class GoogleMeetHomePage {
	@FindBy(xpath="(//div[@class='VfPpkd-RLmnJb'])[1]")private WebElement newMeetingButton;
    @FindBy(xpath="(//li[@role='menuitem'])[6]")private WebElement startAnInstantMeetingButton;
    @FindBy(xpath="//button[@class='VfPpkd-Bz112c-LgbsSe yHy1rc eT1oJ tWDL4c  jh0Tpd Gt6sbf QQrMi']")private WebElement meetingEndButton;
    public GoogleMeetHomePage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickOnNewMeetingButton(WebDriver driver) {
    	UtilityNeoStox.wait(driver, 500);
    	newMeetingButton.click();
    	Reporter.log("clicking On new Meeting Button", true);
    }
    public void clickOnStartAnInstantMeetingButton(WebDriver driver) {
    	UtilityNeoStox.wait(driver, 500);
    	startAnInstantMeetingButton.click();
    	Reporter.log("clicking On start An Instant Meeting Button", true);
    }
    public void clickOnMeetingEndButton(WebDriver driver) {
    	UtilityNeoStox.wait(driver, 500);
    	meetingEndButton.click();
    	Reporter.log("clicking On  Meeting End Button", true);
    }

}
