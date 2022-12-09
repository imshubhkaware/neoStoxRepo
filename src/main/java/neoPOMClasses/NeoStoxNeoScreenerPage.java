package neoPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityNeoStox;

public class NeoStoxNeoScreenerPage {
	@FindBy(xpath="//a[@id='tab_allacross']")private WebElement allAcrossTab;
	@FindBy(xpath="//a[@id='tab_eq']")private WebElement equitiesTab;
	@FindBy(xpath="//a[@id='tab_fut']")private WebElement futuresTab;
	@FindBy(xpath="//a[@id='tab_opt']")private WebElement optionsTab;
	@FindBy(xpath="//a[@id='tab_mcxfut']")private WebElement mcxFutureTab;
	@FindBy(xpath="//a[@id='tab_mcxopt']")private WebElement mcxOptionTab;
	@FindBy(xpath="//select[@id='cmb_mktscreener_gl']")private WebElement gainersLoosersDropDown;
	@FindBy(xpath="//input[@id='chk_mktscreener_showniftyonly']")private WebElement niftyCheckBox;
	@FindBy(xpath="//input[@id='chk_mktscreener_showbankniftyonly']")private WebElement bankNiftyCheckBox;
	
public NeoStoxNeoScreenerPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void ClickOnAllAcrossTab(WebDriver driver) {
	UtilityNeoStox.wait(driver, 1000);
	allAcrossTab.click();
	
	Reporter.log("allAcrossTab is clickable",true);
}
public void ClickOnEquitiesTab(WebDriver driver) {
	UtilityNeoStox.wait(driver, 1000);
	equitiesTab.click();
	Reporter.log("equitiesTab is clickable",true);
}
public void ClickOnFuturesTab(WebDriver driver) {
	UtilityNeoStox.wait(driver, 1000);
	futuresTab.click();
	Reporter.log("futuresTab is clickable",true);
}
public void ClickOnOptionsTab(WebDriver driver) {
	UtilityNeoStox.wait(driver, 1000);
	optionsTab.click();
	Reporter.log("optionsTab is clickable",true);
}
public void ClickOnMcxFutureTab(WebDriver driver) {
	UtilityNeoStox.wait(driver, 1000);
	optionsTab.click();
	Reporter.log("McxFutureTab is clickable",true);
}
public void ClickOnMcxOptionTab(WebDriver driver) {
	UtilityNeoStox.wait(driver, 1000);
	optionsTab.click();
	Reporter.log("McxOptionTab is clickable",true);
}
public void ClickOnGainersLoosersDropDown(WebDriver driver) {
	UtilityNeoStox.wait(driver, 1000);
	optionsTab.click();
	Reporter.log("gainersLoosersDropDown is clickable",true);
}
public void ClickOnNiftyCheckBox(WebDriver driver) {
	UtilityNeoStox.wait(driver, 1000);
	optionsTab.click();
	Reporter.log("niftyCheckBox is clickable",true);
}
public void ClickOnBankNiftyCheckBox(WebDriver driver) {
	UtilityNeoStox.wait(driver, 1000);
	optionsTab.click();
	Reporter.log("bankNiftyCheckBox is clickable",true);
}
}

