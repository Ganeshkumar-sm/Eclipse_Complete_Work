package com.hrm.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./Featurefile/orangehrm.login.feature",
		
		glue = "com.hrm.stepdefinition",
		
		dryRun = true,
		
		plugin = {"pretty","html:target/cucumber/reports",
				"json:target/cucumber/reports/index.json",
				"junit:target/cucumber/reports/index.xml"},
		
		monochrome = true,
		
		strict = false
		)

public class HrmRunnerClass// extends AbstractTestNGCucumberTests
{

}
