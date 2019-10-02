package concertWebsite.glue;

import java.util.List;

import org.testng.Assert;

import concertWebsite.services.ConcertsService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerSteps {
	private ConcertsService concertService;
	private List<String> concertList;
	
	
	
	public CustomerSteps(ConcertsService concertService) {
		super();
		this.concertService = concertService;
	}

	@When("I look at the list of concerts")
	public void i_look_at_the_list_of_concerts() {
	   concertList = concertService.getConcerts().getConcerts();
	}

	@Then("I will see {string}")
	public void i_will_see(String concertName) {
	   concertList.forEach(System.out::println);
	   Assert.assertTrue(concertList.contains(concertName));
	}

}
