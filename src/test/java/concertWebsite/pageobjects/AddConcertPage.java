package concertWebsite.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.ctg.driver.DriverManager;
import com.ctg.pages.BasePage;

import concertWebsite.model.Concert;

public class AddConcertPage extends BasePage{
	
	@FindBy(id = "concertName")
	private WebElement concertName;
	
	@FindBy(id = "artistName")
	private WebElement artistName;
	
	@FindBy(id = "venueName")
	private WebElement venueName;
	
	@FindBy(id = "concertDate")
	private WebElement concertDate;
	
	@FindBy(id = "concertTime")
	private WebElement concertTime;
	
	@FindBy(css = "input[type='submit']")
	private WebElement addBtn;
	
	public AddConcertPage(DriverManager driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void addConcert(Concert concert) {
		enter(concertName,concert.getConcertName());
		selectBy(artistName,concert.getArtistName());
		selectBy(venueName, concert.getVenueName());
		enter(concertDate,concert.getConcertDate());
		scrollIntoView(concertTime);
		enter(concertTime, concert.getConcertTime());
		scrollIntoView(addBtn);
		addBtn.click();
	}
	
	private void selectBy(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	private void enter(WebElement element,String term) {
		element.click();
		element.clear();
		element.sendKeys(term);
	}
	
	private void scrollIntoView(WebElement element) {
		((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
