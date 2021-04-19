package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
	
	@Given("User should be on application login page")
	public void user_should_be_on_application_login_page() {
	  
	}

	@Then("User should enter {string} and {string}")
	public void user_should_enter_and(String ud, String pid) {

		System.out.println("User name is = "+ud);
		System.out.println("Password is = " +pid);
	}

	@Then("User should press login button.")
	public void user_should_press_login_button() {
	  
	}

}
