package neoPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityNeoStox;

public class NeoStoxPasswordPage {

	@FindBy(xpath="//input[@id='txt_accesspin']")private WebElement password;
	@FindBy(xpath="//a[@id='lnk_submitaccesspin']")private WebElement submitButton;

public NeoStoxPasswordPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterPassword(WebDriver driver,String pass) {
	
	UtilityNeoStox.wait(driver, 500);
	password.sendKeys(pass);
	Reporter.log("sending password", true);
	
}
public void clickOnSubmitButton(WebDriver driver) throws InterruptedException {
	Thread.sleep(2000);
	submitButton.click();
	Reporter.log("clicking on submitButton", true);
	
}


}
