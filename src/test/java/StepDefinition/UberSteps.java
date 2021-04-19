package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {

	@Given("User wants use book {string} car for journey from uber")
	public void user_wants_use_book_car_for_journey_from_uber(String carType) {
		System.out.println("Step1: " + carType);
	}

	@When("User select {string} car and pick up point is {string} and drop location is {string}")
	public void user_select_car_and_pick_up_point_is_and_drop_location_is(String carType, String PPoint,
			String DPoint) {
		System.out.println("Step2: " + carType + " and " + PPoint + " and " + DPoint);
	}

	@Then("Driver start the journey")
	public void driver_start_the_journey() {
		System.out.println("Step3: Start Journey");
	}

	@Then("Driver reach the {string}")
	public void driver_reach_the_destination(String DPoint) {
		System.out.println("Step4: Reach to "+DPoint);
	}

	@Then("User pay {int} Rupess")
	public void user_pay_rupess(Integer amt) {
		System.out.println("Step5: amount is paid " +amt);
	}

}
