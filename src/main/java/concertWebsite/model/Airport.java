package concertWebsite.model;

public class Airport {
	
	String name;

	public Airport(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Airport [name=" + name + "]";
	}

}
