package concertWebsite.pageobjects;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ctg.driver.DriverManager;
import com.ctg.pages.BasePage;

import concertWebsite.model.Concert;

public class HomePage extends BasePage {

	@FindBy(css = "table tbody tr:not(:first-of-type)")
	private List<WebElement> concerts;

	public HomePage(DriverManager driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public List<Concert> getAllConcerts() {
		List<Concert> allConcerts = concerts.stream().map(element -> convertConcert(element))
				.collect(Collectors.toList());
		allConcerts.forEach(System.out::println);
		return allConcerts;
	}

	private Concert convertConcert(WebElement concertInformation) {
		List<WebElement> information = concertInformation.findElements(By.cssSelector("td"));
		String concertName = information.get(0).getText();
		String artistName = information.get(1).getText();
		String venueName = information.get(2).getText();
		String concertDate = information.get(4).getText();
		String concertTime = information.get(5).getText();
		return new Concert(concertName, artistName, venueName, concertDate, concertTime);
	}

}
