package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/HP/eclipse-workspace/CucumberBDD/src/main/java/Features/AddCustomer.feature" //Path of the feature file
		,
		glue= {"StepDefinitions"},  //name of step definitions package
		dryRun = false,        //Before running the test case just to check all steps has method body
		monochrome = true,
	    strict = true,
		plugin = {"pretty",
		              "html:test-output"}
		
		
		
		)
public class RunnerTest {

}
