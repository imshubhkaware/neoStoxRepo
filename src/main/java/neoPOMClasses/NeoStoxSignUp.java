package neoPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityNeoStox;

public class NeoStoxSignUp {

	
	//signup code
	
	
	@FindBy(xpath="//input[@id='MainContent_signinsignup_txt_mobilenumber']")private WebElement mobileNo;
    @FindBy(xpath="(//a[text()='Sign Up'])[2]")private WebElement signUpButton;

public NeoStoxSignUp(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

    public void enterMobileNumber(WebDriver driver,String mobNum) {
    	UtilityNeoStox.wait(driver, 1000);
    	mobileNo.sendKeys(mobNum);
    	Reporter.log("sending mobile number",true);
    }
    public void clickOnSignUpButton(WebDriver driver) {
    	UtilityNeoStox.wait(driver, 1000);
    	signUpButton.click();
    	
    	Reporter.log("clicking on SignUP button",true);
    }
}