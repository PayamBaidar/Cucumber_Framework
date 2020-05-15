package com.company.stepdefi;

import com.company.factory.WebDriverManager;
import com.company.pageclass.login_pages;
import com.company.utils.CommonFunction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login extends WebDriverManager {
	
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

	@When("^the user donot enter any data$")
	public void the_user_donot_enter_any_data() throws Throwable {
	}

	@When("^the user click on create Account link$")
	public void the_user_click_on_create_Account_link() throws Throwable {
	}

	@Then("^\"([^\"]*)\" should be displayed$")
	public void should_be_displayed(String arg1) throws Throwable {
	}

}
