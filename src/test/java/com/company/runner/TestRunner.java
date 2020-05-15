package com.company.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = { 
				"pretty:STDOUT", "html:Reports.cucumber-pretty",
		},
		
//			tags = "@Smoke",
		
		features = {
//				"src\\test\\resources\\features",
				"src\\test\\resources\\features\\login.feature"
				
		
		}, glue = "src\\test\\java\\com\\company\\stepdefi"
				
//				dryRun = false
		)
		



public class TestRunner {

}
