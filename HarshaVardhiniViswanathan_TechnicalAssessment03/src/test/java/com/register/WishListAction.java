package com.register;

import org.openqa.selenium.support.PageFactory;

public class WishListAction {
	WishListLocator wishLoc;
	
	public WishListAction() {
		wishLoc = new WishListLocator();
		PageFactory.initElements(HelperClass.getdriver(), wishLoc);
	}
	
	public void clicklogin() {
		wishLoc.loginLink.click();
	}
	public void setEmail(String email) {
		wishLoc.email.sendKeys(email);
	}
	public void setPassword(String password) {
		wishLoc.password.sendKeys(password);
	}
	public void clickLoginButton() {
		wishLoc.loginButton.click();
	}
	public void clickShoes() {
		wishLoc.clickShoes.click();
	}
	public void clickSneakers() {
		wishLoc.clickSneakers.click();
	}
	public void addWishList() {
		wishLoc.addWishList.click();
	}
	public void clickWishList() {
		wishLoc.clickWishList.click();
	}
	public void clickRemove() {
		wishLoc.clickRemove.click();
	}
	public void clickUpdateWish() {
		wishLoc.clickUpdateWishList.click();
	}
	public String verifyText() {
		return wishLoc.verifyText.getText();
	}
	public void login(String email, String password) {
		clicklogin();
		setEmail(email);
		setPassword(password);
		clickLoginButton();
	}
	public void addToWishList() {
		clickShoes();
		clickSneakers();
		addWishList();
	}
	public void removeWishList() {
		clickWishList();
		clickRemove();
		clickUpdateWish();
	}
}
