package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void beforeHooks() {
		System.out.println("beforeHooks");
	}
	
	@Before("@one")
	public void beforeHooksOne() {
		System.out.println("beforeHooksOne");		
	}
	
	@After
	public void afterHooks() {
		System.out.println("afterHooks");
	}
}
