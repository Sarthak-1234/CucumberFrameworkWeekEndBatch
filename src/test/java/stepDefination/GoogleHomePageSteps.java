package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleHomePageSteps {
	
	@Given("Launch Google Home Page")
	public void launch_Google_Home_Page() {
	    System.out.println("Launching Google Homepage");
	}

	@Then("Verify title of google homepage")
	public void verify_title_of_google_homepage() {
	    System.out.println("Verifying title");
	}
	
	
	@When("I enter {string} in textbox")
	public void i_enter_in_textbox(String string) {
	    System.out.println("Typing "+string);
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
	    System.out.println("Clicking on search button");
	}

	@Then("It shows {string} results")
	public void it_shows_results(String string) {
	    System.out.println("Verify results = "+string);
	}
	
	//Cucumber---Reporting, Hooks, Tags... + Excel Reader
	
	//1. Page Object Model
	//2. Write one time and use that feature any where
	
	
}
