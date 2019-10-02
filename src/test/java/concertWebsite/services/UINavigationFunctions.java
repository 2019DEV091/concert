package concertWebsite.services;

import concertWebsite.pageobjects.ConcertPage;
import concertWebsite.pageobjects.GooglePage;

public class UINavigationFunctions implements NavigationFunctions {
	
	private final GooglePage googlePage;
	private final ConcertPage concertPage;

	public UINavigationFunctions(GooglePage googlePage, ConcertPage concertPage) {
		super();
		this.googlePage = googlePage;
		this.concertPage = concertPage;
	}



	@Override
	public void goToPage(String page) {
		switch (page) {
		case "Google":
			googlePage.goToGooglePage();
			break;
		case "addConcert":
			concertPage.goToAddConcert();
		default:
			break;
		}
	}

}
