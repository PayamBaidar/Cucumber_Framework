package com.company.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = { 
				"pretty:STDOUT", "html:Reports.cucumber-pretty",
		},
		
		monochrome = true,

		
		features = {"src\\test\\resources\\features\\login.feature"	
		
		}, glue= "com\\company\\stepdefi"
//				,dryRun = true
  		)
		



public class Payam_Runner {

}
