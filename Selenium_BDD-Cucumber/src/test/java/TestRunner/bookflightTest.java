package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/FeatureFile/bookflight.feature",
		glue={"Stepdefinition"},
		plugin = {"pretty",
					"json:target/cucumber/cucumber.json",
					"html:target/cucumber/Cucumber-html-reports"}
				)

public class bookflightTest {

}
