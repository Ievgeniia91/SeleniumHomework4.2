package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/features"}, glue = {"stepdefs"}, format = {"pretty",
"json:target/cucumber.json",
        "html:target/reports-pretty/"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
