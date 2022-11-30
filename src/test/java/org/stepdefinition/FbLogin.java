package org.stepdefinition;

import org.bas.BaseClass;
import org.pojo.FbLoginPojo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {

	FbLoginPojo f;

	@When("To launch url of the facebook application")
	public void to_launch_url_of_the_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		f = new FbLoginPojo();
		passText("Seleniuminameks@gmail.com", f.getEmail());
		
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		f = new FbLoginPojo();
		passText("Inmakes", f.getPassword());

	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new FbLoginPojo();
		clickBtn(f.getLoginBtn());
	}

	@When("To check whether it navigate to the homepage or not")
	public void to_check_whether_it_navigate_to_the_homepage_or_not() {
		System.out.println("To check your credentials");
	}
	@Then("To close the browser")
	public void to_close_the_browser() {
	   closeEntireBrowser();
	}

}
