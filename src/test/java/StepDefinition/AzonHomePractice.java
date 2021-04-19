package StepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AzonHomePractice {
	
	@Given("user is on amazon page")
	public void user_is_on_amazon_page() {
	}

	@Then("user get amazon search")
	public void user_get_amazon_search() {
	}

	@Then("username is displayed next to search field")
	public void username_is_displayed_next_to_search_field() {
	}

	@Then("amazon logo is also dispalyed")
	public void amazon_logo_is_also_dispalyed() {
	}

	@Then("Card link is also dispalyed")
	public void card_link_is_also_dispalyed() {
	}


	@When("user scrolls down to todays deal section")
	public void user_scrolls_down_to_todays_deal_section() {
	}

	@Then("user get the list of multipal product")
	public void user_get_the_list_of_multipal_product() {
	}

	@Then("user get product name and price details")
	public void user_get_product_name_and_price_details() {
	}

	@Then("user get more information for product after click on productlink")
	public void user_get_more_information_for_product_after_click_on_productlink() {
	}

	@Given("user is on amazon home page")
	public void user_is_on_amazon_home_page() {
	}

	@When("user is scroll down to footer of the page")
	public void user_is_scroll_down_to_footer_of_the_page() {
	}

	@Then("user get all country list")
	public void user_get_all_country_list(DataTable datatable) {
		List<List<String>> Countrylist =datatable.asLists();
       System.out.println(Countrylist);
	}

	@Then("user gets all amazon service links")
	public void user_gets_all_amazon_service_links(DataTable dataTable) {
		List<List<String>> AmazonService = dataTable.asLists();
		System.out.println(AmazonService);
	}

	@Then("user gets all privacy policy links")
	public void user_gets_all_privacy_policy_links() {
	}

}
