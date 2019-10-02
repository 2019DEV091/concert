package concertWebsite.services;

public interface GoogleFunctions {
	public void searchFor(String keyword);
	public void assertUrlOfResult(int resultNumber, String url);
}
