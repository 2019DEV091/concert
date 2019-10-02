package concertWebsite.glue;

import concertWebsite.model.Concert;
import concertWebsite.services.AutomationApi;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumSteps {
	private AutomationApi api;
	
	
	public SeleniumSteps(AutomationApi api) {
		super();
		this.api = api;
	}
	
	@Given("I am on the {word} page")
	public void i_am_on_the_Google_page(String page) {
	   api.getNavigationFunctions().goToPage(page);
	}

	@When("I search for {string}")
	public void i_search_for(String searchKey) {
	   api.getGoogleFunctions().searchFor(searchKey);
	}

	@Then("the url of result {int} is {string}")
	public void the_url_of_result_is(Integer resultNumber, String url) {
	   api.getGoogleFunctions().assertUrlOfResult(resultNumber, url);
	}
	
	@Given("I am on the {string} page")
	public void i_am_on_the_page(String page) {
		 api.getNavigationFunctions().goToPage(page);
	}

	@When("I add a concert with the following information")
	public void i_add_a_concert_with_the_following_information(Concert concert) {
	   api.getConcertFunctions().addConcert(concert);
	}

	@Then("that concert is present in the concert overview")
	public void that_concert_is_present_in_the_concert_overview() {
	    api.getConcertFunctions().assertConcertIsPresentInOverView();
	}

}
