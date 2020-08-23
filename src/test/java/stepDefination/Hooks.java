package stepDefination;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import reporting.ReportingClass;

public class Hooks {
	
	@Before
	public void launchBrowser(Scenario sc) {
		System.out.println("Current Scenario is: "+sc.getName());
		ReportingClass.initScenario(sc.getName());
	}

	@After
	public void closeBrowser() {
		System.out.println("After Hook");	
	}
	
	//Hooks file should be present in stepDefination
	
//	@Before ("@loginScenario")
//	public void Login_correct_credentials() {
//		
//	}
	
	
//	@Before(order = 1)
//	public void abc() {
//		System.out.println("Before - abc1");
//	}
//	
//	@Before(order = 2)
//	public void abcd() {
//		System.out.println("Before - abc2");
//	}
//	
//	@Before(order = 3)
//	public void abce() {
//		System.out.println("Before - abc3");
//	}
//	
//	@After (order = 1)
//	public void closeBrowse() {
//		System.out.println("After - closing browser");	
//	}
//	
//	@After (order = 2)
//	public void closeB() {
//		System.out.println("After - closing browser");	
//	}
//	
//	@After (order = 3)
//	public void closeBro() {
//		System.out.println("After - closing browser");	
//	}
//	
	
}
