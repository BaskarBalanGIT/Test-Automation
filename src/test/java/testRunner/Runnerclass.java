package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "", plugin = { "pretty",
		"json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/cucumberreport.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class Runnerclass {

}
