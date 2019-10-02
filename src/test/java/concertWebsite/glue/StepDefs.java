package concertWebsite.glue;

import java.util.Map;

import org.testng.Assert;

import concertWebsite.model.Airport;
import concertWebsite.model.ConcertOrganizer;
import concertWebsite.model.GeoLocation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
	
	ConcertOrganizer organizer;
	@Given("a concert organizer")
	public void a_concert_organizer() {
	   organizer = new ConcertOrganizer();
	}

	@When("the organizer adds a concert named {string}")
	public void the_organizer_adds_a_concert_named(String concert) {
	    organizer.addConcert(concert);
	}

	@Then("the organizer will see {string} listed")
	public void the_organizer_will_see_listed(String concert) {
	   Assert.assertEquals(organizer.getListedConcert(), concert);
	}
	
	@Given("number {}")
	public void number(Integer digit) {
	   System.out.println("here");
	   System.out.println(digit);
	   
	}
	
	
//	@Given("the following airports")
//	public void the_following_airports(Map<Airport,GeoLocation> airports) {
//		
//		
//	}
	
	@Given("the following airports")
	public void the_following_airports(Map<Airport,GeoLocation> airports) {
		
		
	}
}
