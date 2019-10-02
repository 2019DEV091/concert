package concertWebsite.services;

import concertWebsite.model.Concert;

public interface ConcertFunctions {
	void addConcert(Concert concert);
	void assertConcertIsPresentInOverView();
}
