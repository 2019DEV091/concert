package concertWebsite.glue;

import concertWebsite.services.ConcertsService;
import concertWebsite.services.OrganizerService;
import cucumber.api.java.en.Given;

public class OrganizerSteps {

	OrganizerService organizerService;
	ConcertsService concertsService;

	public OrganizerSteps(OrganizerService organizerService, ConcertsService concertsService) {
		super();
		this.organizerService = organizerService;
		this.concertsService = concertsService;
	}

	@Given("a concert organizer named {string}")
	public void a_concert_organizer_named(String name) {
		organizerService.createOrganizer(name);
	}

	@Given("he adds a concert named {string} to the list of concerts")
	public void he_adds_a_concert_named_to_the_list_of_concerts(String name) {
		concertsService.getConcerts().addConcert(name);
	}

}
