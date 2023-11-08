package com.register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocator {
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement clicklogin;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[@class='account'][1]")
	WebElement verifyemail;
	
	@FindBy(xpath = "//a[@class='ico-logout']")
	WebElement logout;
	
	@FindBy(xpath = "//span[text()='Login was unsuccessful. Please correct the errors and try again.']")
	WebElement verifyLoginText;

}
