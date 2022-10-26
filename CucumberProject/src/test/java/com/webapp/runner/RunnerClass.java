package com.webapp.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = "./Featurefile/login.feature", 
		
		glue = "com.webapp.stepdefinition",
		
		dryRun = true,
		
		plugin = {"pretty","html:target/cucumber/reports","json:target/cucumber/reports/index1.json",
				"junit:target/cucumber/reports/index1.xml"},
		
		monochrome = true,
		
		strict = false
		

)

public class RunnerClass extends AbstractTestNGCucumberTests{

}
