package com.company.stepdefi;

import com.company.factory.WebDriverManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	WebDriverManager drivermain=new WebDriverManager();
	
	
	@Before
	public void beforesteps()
	{
		
		
		drivermain.initalizeDriver();
		
	}
	@After	
	public void aftersteps()
	{
		
		drivermain.quitDriver();
		
		
	}
	
	

}
