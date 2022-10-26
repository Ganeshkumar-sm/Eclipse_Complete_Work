package com.webapp.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./Featurefile/login.feature", 
		glue = "com.webapp.stepdefinition"

)

public class RunnerClass {

}
