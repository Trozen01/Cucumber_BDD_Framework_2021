package StepDefinition;


import org.junit.Assert;

import Utilities.Product;
import Utilities.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	Product product;       //class veriable
	Search search;
	
	@Given("I have search field in amazon page")
	public void i_have_search_field_in_amazon_page() {
	  System.out.println("Step1: I have search on Amazon page");
	}

	@When("I search for {string} and price is {int}")
	public void i_search_for_and_price_is(String Productname, Integer Price) {
		System.out.println("Step2: Search with product name "+Productname+" Price: "+Price);
	  
		product = new Product(Productname, Price);
	}

	@Then("product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String Productname) {
		System.out.println("Step3: Product"+ Productname +"is dispalyed");
		
		search = new Search();
		String name = search.dispalyProduct(product);
		System.out.println("Searched product is: " +name);
		
		Assert.assertEquals(product.getProductname(), name);
	}

}
