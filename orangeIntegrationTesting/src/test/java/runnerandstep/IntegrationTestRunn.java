package runnerandstep;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\features"}, 
		
glue = {"runnerandstep"}, 
plugin = {"pretty",
        "html:target/reports/cucumber.html",
        "json:target/report/cucumber.json"},
 tags="@Test-1 or Test-2",
dryRun = false, monochrome = true
)

public class IntegrationTestRunn {

}
