package com.register;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class LoginStepDefinition {
		
		LoginAction loginAction = new LoginAction();
		DataProperties data = new DataProperties();
		@Given("User trying to launch webpage")
		public void user_trying_to_launch_webpage() {
			System.out.println("Login url");
		    HelperClass.openingPage(data.url);
		}

		@When("User trying to click Login")
		public void user_trying_to_click_login() {
			loginAction.clickLoginaction();
		}

		@When("User trying to enter valid email and password")
		public void user_trying_to_enter_valid_email_and_password() {
			loginAction.loginDetails(data.email,data.password);
		}

		@When("User trying to click login button")
		public void user_trying_to_click_login_button() {
			 loginAction.clickingLoginBtn();
		}

		@Then("User confirms whether logged in successfully")
		public void user_confirms_whether_logged_in_successfully() {
			 Assert.assertTrue(loginAction.loginVerify().equals("harshahk099@gmail.com"));
		}

		@When("User trying to enter invalid email and password")
		public void user_trying_to_enter_invalid_email_and_password() {
			loginAction.loginDetails(data.email1, data.password2);
		    loginAction.clickLogOut();
		}

		@Then("User confirms whether invalid message occurred")
		public void user_confirms_whether_invalid_message_occurred() {
			loginAction.checkingLoginError();
		}


}