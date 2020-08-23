package stepDefination;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLoginsteps {
	
	@Given("Launch Gmail")
	public void launch_Gmail() {
	    System.out.println("Launching gmail");
	}

	@When("I enter username {string}")
	public void i_enter_username(String string) {
	    System.out.println("Entering username = "+string);
	}

	@When("I click next button")
	public void i_click_next_button() {
	    System.out.println("Clicking on next button");
	}

	@When("I enter password {string}")
	public void i_enter_password(String string) {
	    System.out.println("Entering password = "+string);
	}
	
	@Then("Then I verify appropriate profile of gmail")
	public void then_I_verify_appropriate_profile_of_gmail() {
	    System.out.println("Verifying profiles");
	}
	
	@When("Login with appropriate credentials")
	public void login_with_appropriate_credentials() {
	    System.out.println("Login with correct username and password");
	}
	//if we use scenario outline ----following comp
	@Then("I verify following components {string}")
	public void i_verify_following_components(String string) {
	    System.out.println("Checking ==="+string);
	}
	
	
	@Then("I verify following components:")
	public void i_verify_following_components(io.cucumber.datatable.DataTable dataTable) {
		List<String> list = dataTable.asList();
		
		
		for(String e: list) {
			System.out.println("Checking ======"+e);
		}
		
	}

}
