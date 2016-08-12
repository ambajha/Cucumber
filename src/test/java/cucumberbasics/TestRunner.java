package cucumberbasics;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue={"StepDefination"})
public class TestRunner {
	

}
