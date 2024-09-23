package naukariRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/java/Features"}, 
				
				

glue = {"naukariStepDef"}, 
plugin = {"pretty",
        "html:target/report/cucumber.html",
        "json:target/report/cucumber.json"
},
 
dryRun = false, monochrome = true
)

public class RunnerNaukari {

}
