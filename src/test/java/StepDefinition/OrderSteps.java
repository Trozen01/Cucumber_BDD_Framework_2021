package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {

	@Given("a registered user exists")
	public void a_registered_user_exists() {
	  // System.out.println("a registered user exists");
	}

	@Given("user is on Amazon login page")
	public void user_is_on_amazon_login_page() {
	  // System.out.println("user is on Amazon login page");
	}

	@When("user enters user name")
	public void user_enters_user_name() {
	  //System.out.println("user enters user name");
	}

	@When("user enters password")
	public void user_enters_password() {
	  //System.out.println("user enters password");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	  //System.out.println("user click on login button");
	}

	@Then("user navigate to order page")
	public void user_navigate_to_order_page() {
	  //System.out.println("user navigate to order page");
	}

	@When("User click on order link")
	public void user_click_on_order_link() {
	 // System.out.println("User click on order link");
	}

	@Then("user check previous order details")
	public void user_check_previous_order_details() {
	  //System.out.println("user check previous order details");
	}

	@When("User click on open order link")
	public void user_click_on_open_order_link() {
	  //System.out.println("User click on open order link");
	}

	@Then("user check open order details")
	public void user_check_open_order_details() {
	  //System.out.println("user check open order details");
	}

	@When("User click on Cancelled order link")
	public void user_click_on_cancelled_order_link() {
	  //System.out.println("User click on Cancelled order link");
	}

	@Then("user check Cancelled order details")
	public void user_check_cancelled_order_details() {
	 // System.out.println("user check Cancelled order details");
	}

}
