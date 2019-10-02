package concertWebsite.services;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import concertWebsite.pageobjects.GooglePage;


public class UIGoogleFunctions implements GoogleFunctions {
	
	private final GooglePage googlePage;

	public UIGoogleFunctions(GooglePage googlePage) {
		super();
		this.googlePage = googlePage;
	}

	@Override
	public void searchFor(String keyword) {
		googlePage.clickAndEnterSomething(keyword+Keys.ENTER);

	}

	@Override
	public void assertUrlOfResult(int resultNumber, String url) {
		Assert.assertEquals(googlePage.getUrlOfResult(resultNumber), url);

	}

}
