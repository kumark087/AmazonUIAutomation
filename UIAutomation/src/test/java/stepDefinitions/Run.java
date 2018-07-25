package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = {"@checkout"}, dryRun = false, strict = true, format = {"pretty", "html:target/reports"})

public class Run {
}
