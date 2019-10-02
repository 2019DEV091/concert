package concertWebsite.model;

import java.util.ArrayList;
import java.util.List;

public class Concerts {
	
	List<String> concerts;
	
	public Concerts() {
		concerts = new ArrayList<String>();
	}
	
	public void addConcert(String name) {
		concerts.add(name);
	}
	
	public List<String> getConcerts() {
		return concerts;
	}

}
