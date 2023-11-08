package com.register;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListStepDefinition {
	WishListAction wishlistAction = new WishListAction();
	@Given("User in the HomePage")
	public void user_in_the_home_page() {
		HelperClass.openingPage("https://demowebshop.tricentis.com/");
	}

	@When("User login to Account")
	public void user_login_to_account() {
		wishlistAction.login("harshahk099@gmail.com","123456");
	    HelperClass.log.info("User Login");
	}

	@When("User adds product to wishlist")
	public void user_adds_product_to_wishlist() {
		wishlistAction.addToWishList();
	    HelperClass.log.info("User added to wishlist");
	}

	@When("user remove from wihslist")
	public void user_remove_from_wihslist() {
		wishlistAction.removeWishList();
	    HelperClass.log.info("User removed from wish list");
	}

	@Then("User see empty wishList message after removing it")
	public void user_see_empty_wish_list_message_after_removing_it() {
		Assert.assertTrue(wishlistAction.verifyText().contains( "The wishlist is empty!"));
	    HelperClass.log.info("User get empty wishlist");
	}

}
