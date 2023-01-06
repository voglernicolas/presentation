package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber.html"},
        features = {"classpath:features/"},
        glue = {"stepDefinitions"},
        tags = "@smoke"
)

public class MainRunner {
}
