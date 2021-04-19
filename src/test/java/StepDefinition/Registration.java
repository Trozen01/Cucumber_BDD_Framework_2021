package StepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Registration {
	
	@Given("User should be redirect to Registration URL")
	public void user_should_be_redirect_to_registration_url() {

		System.out.println("User redirect to Registration Page");
	}

	@Then("User should be enter following data")
	public void user_should_be_enter_following_data(DataTable tabledetails) {
	   
		List<List<String>> userList =tabledetails.asLists(String.class);
		
		for(List<String> e: userList){
			System.out.println("Value from list is following");
			System.out.println(e);
			
		}
	}
     //following method is only for second scenaroi. (With column name)
	@Then("User should be enter following data with column name")
	public void user_should_be_enter_following_data_with_column_name(DataTable dataTable) {
	  
		List<Map<String, String>> usermap =dataTable.asMaps(String.class, String.class); 
		
		//System.out.println("Values from Table:-"+usermap );
		//System.out.println(usermap.get(1).get("Name"));
		//System.out.println(dataTable.cell(3, 2));   //use for fatch particular cell value
		
		for (Map<String, String> e : usermap){
			System.out.println(e.get("Name"));
			System.out.println(e.get("Sname"));
			System.out.println(e.get("Emailid"));
			System.out.println(e.get("Mobile no"));
			System.out.println(e.get("City"));
			
		}
		
	}
	
	
	@Then("Sure should be registered successfully")
	public void sure_should_be_registered_successfully() {
		System.out.println("User Registered successfully");
	   
	}

}
