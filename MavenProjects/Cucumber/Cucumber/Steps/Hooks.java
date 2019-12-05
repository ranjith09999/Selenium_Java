package Cucumber.Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void preScenario(Scenario sc) {
		System.out.println("Scenario Name "+sc.getName());
		System.out.println("Scenario ID "+sc.getId());
		System.out.println("Scenario Status before "+sc.getStatus());
	}
	@After
	public void postScenario(Scenario sc) {
		System.out.println("Scenario Status after "+sc.getStatus());
	}
}





