package stepDefination;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import init.initClass;
import reporting.ReportingClass;

public class MMTHomePageTest extends initClass{
	
	//Steps

	public MMTHomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("Launch the HomePage")
	public void launch_the_HomePage() throws Throwable{
		
		try {
		homepage.navigateToHomePage();
		ReportingClass.infoLogPass("Launch the HomePage");
		} catch(Exception e) {
			ReportingClass.reportFailure("Launch the HomePage", initClass.driver);
		}
	}

	@Then("Verify the title of homepage")
	public void verify_the_title_of_homepage() throws Throwable {
	   
		try {
	    Assert.assertEquals(homepage.getTitle(), "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday", "Title Mismatched");
	    ReportingClass.infoLogPass("Verify the title of homepage");
		} catch(Exception e) {
			ReportingClass.reportFailure("Verify the title of homepage", initClass.driver);
		}
	}
	//Checking basic attributes of Homepage
//	@Then("Verify below basic attributes of the homepage:")
//	public void verify_below_basic_attributes_of_the_homepage(io.cucumber.datatable.DataTable dataTable) {
//		List<String> homePageAttList = dataTable.asList();
//		for(String e: homePageAttList) {
//			if(e.equals("makemytriplogo")) {
//				homepage.checkLogo();
//			} else if(e.equals("searchButton")) {
//				homepage.checkSearchButton();
//			} else if(e.equals("loginAccountButton")) {
//				homepage.checkLoginButton();
//			}
//		}
//		
//
//		  
//	}
	
	@Then("Verify below basic attributes of the homepage:")
	public void verify_below_basic_attributes_of_the_homepage(io.cucumber.datatable.DataTable dataTable) throws Throwable {
		try {
		List<String> homePageAttList = dataTable.asList();
		for(String e: homePageAttList) {
			homepage.checkHomePageBasicAtt(e);
		}
		ReportingClass.infoLogPass("Verify below basic attributes of the homepage:");
		} catch(Exception e) {
			ReportingClass.reportFailure("Verify below basic attributes of the homepage:", initClass.driver);
		}
		
		

		  
	}

}
