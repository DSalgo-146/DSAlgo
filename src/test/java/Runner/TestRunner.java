package Runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.Test;

import io.cucumber.testng.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", 
				"html:target/results.html","json:target/cucumber.json","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = false,
		features = "src/test/resources/Features/Home.feature",
		//features = "src/test/resources/Features/Register.feature",
		//features = "src/test/resources/Features/Login.feature",
		//features = "src/test/resources/Features/DataStructure.feature",
		//features = "src/test/resources/Features/Tree.feature",
		tags = "@tag1",		
		//features = "Features",
		glue={"StepDefinition","Hooks"}
		//glue={"StepDefinition"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}