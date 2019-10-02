package concertWebsite.runners;

import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/concertWebsite/features", glue = "concertWebsite/glue", plugin = {
		"json:target/cucumber-report/cucumber.json" },tags = "@Google")
public class RunnerIT extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
