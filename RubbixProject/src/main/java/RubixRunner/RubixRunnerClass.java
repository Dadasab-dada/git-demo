package RubixRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features/"}, 
glue = {"StepDefinition"}, 
plugin = {"pretty",
        "html:target/report/cucumber.html",
        "json:target/report/cucumber.json"
},
 
dryRun = false, monochrome = true
)

public class RubixRunnerClass {
	
	


}
