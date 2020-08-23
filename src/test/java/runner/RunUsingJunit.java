package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import init.initClass;
import reporting.ExtentManager;
import reporting.ReportingClass;

@CucumberOptions(
	//features = "src/test/resources/functionalTestCases/GoogleHomePage.feature",
		dryRun = false,
		features = "src/test/resources/functionalTestCases/MMTHomePage.feature",	
		glue = {"stepDefination"},
		monochrome = true,
		//plugin = {"json:target/cucumber.json"},
		
		plugin = {"pretty","html:target", "json:target/cucumber.json", "junit:target/cucumber.xml"}
		//tags="@run"
		
		//if we want to run all tags except smoke
		//tags="~@Smoke"
)

//if u are runnning through junit

@RunWith(Cucumber.class)
public class RunUsingJunit {
	
	public static ExtentReports report;
	
	@BeforeClass
	public static void beforeClass() {
		report = ExtentManager.setUp("Extent_Reports");
	}
	
	@AfterClass
	public static void afterClass() {
		initClass.driver.close();
		ReportingClass.putReport();
	}

}
