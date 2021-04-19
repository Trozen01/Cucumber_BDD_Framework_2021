package StepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BillingSteps {

	int bAmount;
	double tAmount;
	double fAmount;

	@Given("User is on billing page")
	public void user_is_on_billing_page() {

	}

	@Then("User enter billing amount {int}")
	public void user_enter_billing_amount(Integer Billingamount) {
		this.bAmount =  Billingamount;
		//this.bAmount =  Double.parseDouble(Billingamount);   //need to convert parameter to string for solve this issue(AmbiguousStepDefinitionsException)
	}

	@Then("User enter tax amount {double}")
	public void user_enter_tax_amount(Double Taxamount) {
		this.tAmount = Taxamount;
	}

	@Then("User enter tax amount {int}")
	public void user_enter_tax_amount(Integer Taxamount) {
		this.tAmount = Taxamount;
	}

	@Then("System will give final amount {int}")
	public void system_will_give_final_amount(Integer Finalamount) {
		this.fAmount = Finalamount;

		Assert.assertTrue(this.equals(Finalamount == fAmount));
	}

	@Then("System will give final amount {double}")
	public void system_will_give_final_amount(Double Finalamount) {
		this.fAmount = Finalamount;
		Assert.assertTrue(this.equals(Finalamount == fAmount));
	}

}
