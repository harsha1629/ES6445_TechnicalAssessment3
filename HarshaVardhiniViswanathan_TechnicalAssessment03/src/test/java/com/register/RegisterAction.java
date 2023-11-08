package com.register;

import org.openqa.selenium.support.PageFactory;

public class RegisterAction {
	RegisterLocator regLocator;
	
	RegisterAction() {
		this.regLocator = new RegisterLocator();
		PageFactory.initElements(HelperClass.getdriver(), regLocator);
	}
	public void clickRegister() {
		regLocator.registerclick.click();
	}
	public void setGender() {
		regLocator.radiofemaleclick.click();
	}
	public void setFirstname(String firstname) {
		regLocator.firstname.sendKeys(firstname);
	}
	public void setLastname(String lastname) {
		regLocator.lastName.sendKeys(lastname);
	}
	public void setEmail(String email) {
		regLocator.email.sendKeys(email);
	}
	public void setPassword(String password) {
		regLocator.password.sendKeys(password);
	}
	public void setConfirmPassword(String cpassword) {
		regLocator.confirmPassword.sendKeys(cpassword);
	}
	public void clickRegisterButton() {
		regLocator.registerButton.click();
	}
	public String getVerifyText() {
		return regLocator.verifyText.getText();
	}
	public void clickLogout() {
		regLocator.logOutButton.click();
	}
	
	public void registerAccount(String firstname,String lastname,String email,String password,String confirmpassword) {
		setFirstname(firstname);
		setLastname(lastname);
		setEmail(email);
		setPassword(password);
		setConfirmPassword(confirmpassword);
	}
}
	
	


