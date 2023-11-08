package com.register;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	HelperClass helperClass = new HelperClass();
	RegisterAction regAction = new RegisterAction();
	@Given("User launch demo web Shop")
	public void user_launch_demo_web_shop() {
	    System.out.println("In Demo shop");
	    helperClass.openingPage("https://demowebshop.tricentis.com/");
	}

	@When("User trying to click register button")
	public void user_trying_to_click_register_button() {
	    regAction.clickRegister();
	}

	@When("User entering gender,firstname,Lastname,email,password and also confirm password")
	public void user_entering_gender_firstname_lastname_email_password_and_also_confirm_password(DataTable datatables) {
		regAction.setGender();
		List<Map<String,String>> registerForm = datatables.asMaps(String.class, String.class);
	    for(Map<String,String> form : registerForm) {
	    	String firstname = form.get("FirstName");
	    	String lastname = form.get("LastName");
	    	String email = form.get("Email");
	    	String password = form.get("Password");
	    	String confirmpassword = form.get("Confirm Password");
	    	regAction.registerAccount(firstname, lastname, email, password, confirmpassword);
	    }
	}

	@When("User click register button")
	public void user_click_register_button() {
	    regAction.clickRegisterButton();
	}

	@Then("User get successfully registerd message and log out")
	public void user_get_successfully_registerd_message_and_log_out() {
	    	Assert.assertTrue(regAction.getVerifyText().equals("Your registration completed"));
	    	regAction.clickLogout();
	}


}
