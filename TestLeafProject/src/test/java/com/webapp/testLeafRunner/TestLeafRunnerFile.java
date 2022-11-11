package com.webapp.testLeafRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(

		features = "./src/main/java/com/webapp/testLeafFeatures/testleaf.feature",

		glue = "./src/test/java/com/webapp/testLeafStepDefinition/TestLeafStepDefinition.java",

		dryRun = true, monochrome = true, strict = false

)

public class TestLeafRunnerFile {

}
