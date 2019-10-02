package concertWebsite.services;

import cucumber.api.Scenario;

public interface Hookable {
	
	public void setup();
	public void teardown(Scenario scenario);

}
