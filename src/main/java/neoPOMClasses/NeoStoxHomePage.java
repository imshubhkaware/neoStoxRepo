package neoPOMClasses;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import neoStoxUtility.UtilityNeoStox;

public class NeoStoxHomePage {

	@FindBy(xpath="//span[@id='lbl_username']")private WebElement userName;
	@FindBy(xpath="//span[@id='lbl_curbalancetop']")private WebElement balance;
	@FindBy(xpath="//span[text()='Logout']")private WebElement logOutButton;
    @FindBy(xpath="(//a[text()='OK'])[2]")private WebElement popUpOkButton;
    @FindBy(xpath="(//a[text()='Close'])[5]")private WebElement popUpCloseButton;
	@FindBy(xpath="//div[@id='analyserDropDownmob']")private WebElement analyserOption;
	@FindBy(xpath="(//span[@class='px-3 w-150'])[2]")private WebElement neoScreenerOption;
    public NeoStoxHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public String getActualUserName() {
		String actualUserName = userName.getText();
		Reporter.log("getting Actual User Name",true);
		return actualUserName;
		
	}
	public String getBalance() {
		String actualBalance = balance.getText();
		Reporter.log("getting Actual Balance", true);
		return actualBalance;
	}
	public void handlePopUp(WebDriver driver) throws InterruptedException {
		
		if(popUpOkButton.isDisplayed())
		{
		UtilityNeoStox.wait(driver, 7000);
		popUpOkButton.click();
		Reporter.log("Handeling popup",true);
		Reporter.log("clicking on OK button of Popup", true);
		UtilityNeoStox.wait(driver, 5000);
		popUpCloseButton.click();
		Reporter.log("clicking on Close button of Popup", true);
		}
		else 
		{
		Reporter.log("there is no Popup", true);
		Thread.sleep(1000);
		}
		}
	public void clickOnNeoScreenerOption(WebDriver driver) throws InterruptedException {
		analyserOption.click();
		Reporter.log("clicking on analyserOption", true);
		Thread.sleep(1000);
		neoScreenerOption.click();
		Reporter.log("clicking on neoScreenerOption", true);
		
	}
	
	public void logOutFromAplication(WebDriver driver) {
		userName.click();
		UtilityNeoStox.wait(driver, 1000);
		logOutButton.click();
		Reporter.log("logging out", true);
		
	}
	
	




}
