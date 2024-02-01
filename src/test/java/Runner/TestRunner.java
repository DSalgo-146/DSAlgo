package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/results.html"},
		monochrome = false,
		//features = "src/test/resources/Features/Home.feature",
		//features = "src/test/resources/Features/Register.feature",
		features = "src/test/resources/Features/Login.feature",		
		//tags = "@logintag",		
		//features = "Features",
		glue={"StepDefinition"}
		)

public class TestRunner {

}
