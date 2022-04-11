package Runners;

import io.cucumber.core.gherkin.Feature;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "C:\\Users\\20120\\IdeaProjects\\Maven1\\src\\main\\resources\\features",
        glue = "SD",
        tags = "@Regression"
)

public class TestRunner {
}
