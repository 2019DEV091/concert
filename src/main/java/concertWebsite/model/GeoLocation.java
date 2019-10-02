package concertWebsite.model;

public class GeoLocation {

	private String lat,lon;

	public GeoLocation(String lat, String lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}

	@Override
	public String toString() {
		return "GeoLocation [lat=" + lat + ", lon=" + lon + "]";
	}
}
