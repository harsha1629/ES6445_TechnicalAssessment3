package com.register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListLocator {
	@FindBy(xpath="//a[text()='Log in']")
	WebElement loginLink;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginButton;
	
	@FindBy(xpath="//ul[@class='top-menu']/li[4]/a")
	WebElement clickShoes;
	
	@FindBy(xpath="//a[text()='Blue and green Sneaker']")
	WebElement clickSneakers;
	
	@FindBy(id="add-to-wishlist-button-28")
	WebElement addWishList;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	WebElement clickWishList;
	
	@FindBy(xpath="//input[@name='removefromcart']")
	WebElement clickRemove;
	
	@FindBy(xpath="//input[@name='updatecart']")
	WebElement clickUpdateWishList;
	
	@FindBy(xpath="//div[@class='page-body']/div")
	WebElement verifyText;
	

}
