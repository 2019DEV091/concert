package concertWebsite.implementations;

import concertWebsite.model.Concerts;
import concertWebsite.services.ConcertsService;

public class DebugConcerts implements ConcertsService {
	private Concerts concerts;

	@Override
	public Concerts getConcerts() {
		if(concerts != null) {
			return concerts;
		}
		createConcerts();
		System.out.println("Create concerts in memory for debugging purposes");
		return getConcerts();
	}

	public void createConcerts() {
		System.out.println("Creating this Concert in memory");
		this.concerts = new Concerts();
	}

}
