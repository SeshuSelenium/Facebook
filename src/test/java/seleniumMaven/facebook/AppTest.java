package seleniumMaven.facebook;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles", glue = "stepDefinition", tags = "@tag2", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:CucumberFacebookReports/reports.html",
		"html:target/cucumber-reports" })
public class AppTest {

	
}