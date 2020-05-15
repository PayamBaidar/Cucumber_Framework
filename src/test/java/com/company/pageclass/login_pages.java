package com.company.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.company.factory.WebDriverManager;

public class login_pages extends WebDriverManager{

	
	
	
	@FindBy(id = "email_create")
	public WebElement createmail;
	
	@FindBy(id = "email")
	public WebElement email;
	
	@FindBy(id = "passwd")
	public WebElement password;
	
	@FindBy()
	public WebElement creataccount;
	
	@FindBy()
	public WebElement signin2;
	
	
	@FindBy(xpath = "//input[@id='id_gender1']")
	public WebElement mrbutton;
	
	@FindBy(xpath = "//input[@id='customer_firstname']")
	public WebElement firstname;
	
	@FindBy(id = "customer_firstname")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement creatpswd;
	
	@FindBy(xpath = "//select[@id='days']")
	public WebElement days;

	@FindBy(xpath = "//input[@class='button-1 login-button']")
	public WebElement signin;
	
	@FindBy(xpath = "//select[@id='months']")
	public WebElement months;
	
	@FindBy(xpath = "//select[@id='years']")
	public WebElement years;
	
	@FindBy(xpath = "//input[@id='address1']")
	public WebElement address;
	
	@FindBy(xpath = "//input[@id='phone']")
	public WebElement phone;
	
	@FindBy(xpath = "//input[@id='city']")
	public WebElement city;
	
	
	
	 
	
	
	public login_pages() {

		PageFactory.initElements(driver, this);
	
	}
	
	
}
