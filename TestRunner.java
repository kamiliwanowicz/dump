package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/features/WilliamHBrown.feature",
				glue="stepDefinitions", tags="@RunThisTest", monochrome=true,
				plugin={"pretty", "html:bin/logs", "json:bin/logs/cucumber.json", "junit:bin/logs/junitReport.xml"}
		
		)
	


public class TestRunner extends AbstractTestNGCucumberTests{
	
	

}
