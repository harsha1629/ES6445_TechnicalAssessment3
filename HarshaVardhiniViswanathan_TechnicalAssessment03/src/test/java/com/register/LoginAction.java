package com.register;

import org.openqa.selenium.support.PageFactory;

public class LoginAction {
	LoginLocator loginloc;
	
	public LoginAction() {
		loginloc = new LoginLocator();
		
		PageFactory.initElements(HelperClass.getdriver(), loginloc);
	}
	
	public void clickLoginaction() {
		loginloc.clicklogin.click();
	}
	
	public void setEmail(String strEmail) {
		loginloc.email.sendKeys(strEmail);
	}
	
	public void setPwd(String strPwd) {
		loginloc.password.sendKeys(strPwd);
	}
	
	public void clickingLoginBtn() {
		loginloc.loginButton.click();
	}
	
	public String loginVerify() {
		return loginloc.verifyemail.getText();
	}
	
	public void clickLogOut() {
		loginloc.logout.click();
	}
	public void checkingLoginError() {
		loginloc.verifyLoginText.getText();
	}
	
	public void loginDetails(String strEmail,String strPwd) {
		setEmail(strEmail);
		setPwd(strPwd);
	}
}
