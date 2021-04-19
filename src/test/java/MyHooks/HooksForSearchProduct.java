package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class HooksForSearchProduct
{
	@Before(order=1)
	public void  setup_Browser(Scenario sc) {
		System.out.println("setup for Browser");
		System.out.println("Name of the scenario is:"+sc.getName()) ;  // we can fatch scenario info(this is very helpfull for generate report)
	}

	@Before(order=2)
	public void  setup_ForLunchURL() {
		System.out.println("Lunch URL");
	}
	/*
	@Before("@Smoke")     // annotation tags with hooks it used for suppose you want execute some steps only for some scenario.
	public void  setup_Browserwithhooks(Scenario sc) {
		System.out.println("setup for Browser for smoke");
	}*/
	
	@BeforeStep
	public void coocke_Setup(){
		
		System.out.println("Save cookies");
	}
	
	@AfterStep
	public void Aftercoockes(){
		
		System.out.println("Delete cookies");
	}
	
	@After(order=2)
	public void  setup_CloseBrowser() {
		System.out.println("setup for Close Browser");
	}

	@After(order=1)
	public void  setup_ForCloseURL(Scenario sc) {
		System.out.println("Close URL");
		System.out.println("Scenari is end here:" + sc.getName() );
	}	
}
