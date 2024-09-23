package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features/"}, 
glue = { "stepDefinitions" }, 
tags = {"@Regression" }, 
dryRun = false, monochrome = true
)
public class TestRunner {
	

}
