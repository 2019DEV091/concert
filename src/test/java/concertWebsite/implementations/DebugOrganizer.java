package concertWebsite.implementations;

import concertWebsite.model.Organizer;
import concertWebsite.services.OrganizerService;

public class DebugOrganizer implements OrganizerService {

	private Organizer organizer;
	
	@Override
	public Organizer getOrganizer() {
		return this.organizer;
	}

	@Override
	public void createOrganizer(String name) {
		System.out.println("Create organizer in memory");
		this.organizer = new Organizer(name);

	}

}
