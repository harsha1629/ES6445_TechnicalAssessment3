package com.register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocator {
	@FindBy(xpath ="//a[@class='ico-register']")
	WebElement registerclick;
	
	@FindBy(xpath = "//input[@id='gender-female']")
	WebElement radiofemaleclick;
	
	@FindBy(xpath = "//input[@name='FirstName']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@name='LastName']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@id='register-button']")
	WebElement registerButton;
	
	@FindBy(xpath ="//div[@class='result']")
	WebElement verifyText;
	
	@FindBy(xpath="//a[@class='ico-logout']")
	WebElement logOutButton;

	

}
