package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//initialization
	@FindBy(xpath="//*[text()='Login']")
	private WebElement clickOnLogin;

	@FindBy(xpath="//*[@type='number']")
	private WebElement clickOnMobileNumber;

	@FindBy(xpath="//*[@type='number']/..")
	private WebElement enterValidMobileNumber;

	@FindBy(xpath="//*[@type='password']")
	private WebElement enterPasswordDetails;

	@FindBy(xpath="//*[@data-testid='login-cta']")
	private WebElement clickOnLoginbutton;

	@FindBy(xpath="//*[text()='D']/../..")
	private WebElement clickonmyprofile;

	@FindBy(xpath="//*[text()='Log Out']/..")
	private WebElement clickOnLogout;
	
	@FindBy(xpath="//*[.='round trip']//*[local-name()='svg']")
	private WebElement clickOnRoundTripButton;
	
	//utilization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Declaration:

	public WebElement getClickOnLogin() {
		return clickOnLogin;
	}

	public WebElement getClickOnMobileNumber() {
		return clickOnMobileNumber;
	}

	public WebElement getEnterValidMobileNumber() {
		return enterValidMobileNumber;
	}

	public WebElement getEnterPasswordDetails() {
		return enterPasswordDetails;
	}

	public WebElement getClickOnLoginbutton() {
		return clickOnLoginbutton;
	}

	public WebElement getClickonmyprofile() {
		return clickonmyprofile;
	}

	public WebElement getClickOnLogout() {
		return clickOnLogout;
	}
	
	public WebElement getClickOnRoundTripButton() {
		return clickOnRoundTripButton;
	}
	public void ClickOnRoundTrip() {
		clickOnRoundTripButton.click();
	}

	public void loginApplication(String mobilenumber,String pwd) {
		clickOnLogin.click();
		clickOnMobileNumber.sendKeys(mobilenumber);
		enterPasswordDetails.sendKeys(pwd);
		clickOnLoginbutton.click();
	}

	public void logoutApplication() {
		clickonmyprofile.click();
		clickOnLogout.click();
	}

}
