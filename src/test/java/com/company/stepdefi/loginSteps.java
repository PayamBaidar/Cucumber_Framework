package com.company.stepdefi;

import org.junit.Assert;

import com.company.factory.WebDriverManager;
import com.company.pageclass.login_pages;
import com.company.utils.CommonFunction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginSteps extends WebDriverManager {
	
	login_pages login = new login_pages();
	
	CommonFunction com = new CommonFunction();
	
	
	
	@Given("^the user is on \"([^\"]*)\"$")
	public void the_user_is_on(String arg1) throws Throwable {
		driver.get(arg1);
		
	}
	

	@Given("^the user click on sign in link$")
	public void the_user_click_on_sign_in_link() throws Throwable {
		com.click(login.signin);

	}

	@When("^the user enter valid username$")
	public void the_user_enter_valid_username() throws Throwable {
		Thread.sleep(3000);
		login.username.clear();
	com.enterData(login.username, "admin@yourstore.com");
	}

	@When("^the user enter valid password$")
	public void the_user_enter_valid_password() throws Throwable {
		login.password.clear();
	com.enterData(login.password, "admin");
	}

	@When("^the user clicks on sigin button$")
	public void the_user_clicks_on_sigin_button() throws Throwable {
		com.click(login.signin);
	
	}

	@Then("^The user is successfully loged in and Dashboard is displays$")
	public void the_user_is_successfully_loged_in_and_Dashboard_is_displays() throws Throwable {

		boolean flag =login.dashboard.isDisplayed();
		Assert.assertTrue(flag);
	}



}
