package concertWebsite.model;

public class ConcertOrganizer {

	private String addedConcert;
	
	public void addConcert(String concert) {
		this.addedConcert = concert;

	}

	public String getListedConcert() {
		return addedConcert;
	}

}
