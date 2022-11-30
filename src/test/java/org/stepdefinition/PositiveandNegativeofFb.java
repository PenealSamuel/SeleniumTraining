package org.stepdefinition;

import org.bas.BaseClass;
import org.pojo.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveandNegativeofFb extends BaseClass {

	FbLoginPojo f;

	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("User has to pass the data{string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		f = new FbLoginPojo();
		passText(em, f.getEmail());
	}

	@When("User has to pass the data{string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		f = new FbLoginPojo();
		passText(pass, f.getEmail());
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		f = new FbLoginPojo();
		clickBtn(f.getLoginBtn());
	}

	@Then("To close browser")
	public void to_close_browser() {
	    closeEntireBrowser();
	}

}
