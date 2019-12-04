package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepdef"},
        features = "src/test/resources/features/",
        plugin = {"json:target/cucumber-report/cucumber.json"}
        )
public class MyRunner {
}
