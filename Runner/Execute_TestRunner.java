package Runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/featurefile/NewToursLogin.feature", 
				 glue= {"StepDefinition"},
				 plugin= {"pretty", "html:target/cucumber-reports"})
			//	tags= {"not @Sanity", "not @Smoke", "@Regression"})

public class Execute_TestRunner {
	
	
}
