package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
	//features = "src/test/resources/functionalTestCases/GoogleHomePage.feature",
		features = "src/test/resources/functionalTestCases",	
		glue = "stepDefination"
)

//if u are runnning through junit

@RunWith(Cucumber.class)
public class RunUsingJunit {

}
