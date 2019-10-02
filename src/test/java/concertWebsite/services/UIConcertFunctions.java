package concertWebsite.services;

import java.util.List;

import org.testng.Assert;

import concertWebsite.model.Concert;
import concertWebsite.pageobjects.AddConcertPage;
import concertWebsite.pageobjects.HomePage;
public class UIConcertFunctions implements ConcertFunctions{
	
	private final AddConcertPage addConcertPage;
	private final HomePage homePage;
	private Concert concert;
	

	public UIConcertFunctions(AddConcertPage addConcertPage,HomePage homePage) {
		super();
		this.addConcertPage = addConcertPage;
		this.homePage = homePage;
	}



	@Override
	public void addConcert(Concert concert) {
		this.concert = concert;
		System.out.println(this.concert);
		addConcertPage.addConcert(this.concert);
	
	}



	@Override
	public void assertConcertIsPresentInOverView() {
		//get the list of concerts
		List<Concert> allConcerts = homePage.getAllConcerts();
		//assert if the list contains concert
		Assert.assertTrue(allConcerts.contains(concert), "Concert: "+concert+" not found in list");
		
	}

}
