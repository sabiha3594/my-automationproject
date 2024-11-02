package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SeleniumPageFactory {
	
	public SeleniumPageFactory(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//*[@name='username']")
	 private WebElement userName;
	@FindBy(xpath="//*[@name='password']")
	private  WebElement passWord;
	@FindBy(xpath="//*[@type='submit']")
	private  WebElement loginBtn;
	@FindBy(xpath="//*[text()='Log out']")
	private WebElement logOutBtn;
	@FindBy(xpath="//*[text()='An internal error has occurred and has been logged.']")
	private WebElement errorMsgWithinvalidCredential;
	
	
	public WebElement getErrorMsgWithinvalidCredential() {
		return errorMsgWithinvalidCredential;
	}
	public WebElement getLogoutbtn() {
		return logOutBtn;
	}
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
}
