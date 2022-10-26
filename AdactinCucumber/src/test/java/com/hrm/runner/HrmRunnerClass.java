package com.hrm.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./Featurefile/orangehrm.login.feature",
		
		glue = "com.hrm.stepdefinition",
		
		dryRun = false,
		
		plugin = {"pretty","html:target/cucumber/reports"},
		
		monochrome = true
		
		
		)

public class HrmRunnerClass {

}
