package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/RegisterUserTest.feature"},
                             plugin = {"pretty","html:target/Report.html"},
                              glue = {"steps"})

public class TestRunner {
}
