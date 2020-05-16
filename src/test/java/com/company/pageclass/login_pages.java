package com.company.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.company.factory.WebDriverManager;

public class login_pages extends WebDriverManager{

	
	
	
	@FindBy(id = "Email")
	public WebElement username;
		
	@FindBy(id = "Password")
	public WebElement password;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	public WebElement signin;
	
	@FindBy(xpath = "//div[contains(.,'Dashboard')]/h1")
	public WebElement dashboard;
//	
//	@FindBy()
//	public WebElement signin2;
//	
//	
//	@FindBy(xpath = "//input[@id='id_gender1']")
//	public WebElement mrbutton;
//	
//	@FindBy(xpath = "//input[@id='customer_firstname']")
//	public WebElement firstname;
//	
//	@FindBy(id = "customer_firstname")
//	public WebElement lastname;
//	
//	@FindBy(xpath = "//input[@id='passwd']")
//	public WebElement creatpswd;
//	
//	@FindBy(xpath = "//select[@id='days']")
//	public WebElement days;
//
//	
//	@FindBy(xpath = "//select[@id='months']")
//	public WebElement months;
//	
//	@FindBy(xpath = "//select[@id='years']")
//	public WebElement years;
//	
//	@FindBy(xpath = "//input[@id='address1']")
//	public WebElement address;
//	
//	@FindBy(xpath = "//input[@id='phone']")
//	public WebElement phone;
//	
//	@FindBy(xpath = "//input[@id='city']")
//	public WebElement city;
//	
	
	
	 
	
	
	public login_pages() {

		PageFactory.initElements(driver, this);
	
	}
	
	
}
