package concertWebsite.glue.hooks;

import concertWebsite.services.Hookable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	private Hookable hookable;

	public Hooks(Hookable hookable) {
		super();
		this.hookable = hookable;
	}
	
	@Before
	public void beforeScenario() {
		hookable.setup();
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		hookable.teardown(scenario);
	}
	
	

}
