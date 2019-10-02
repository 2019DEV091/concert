package concertWebsite.pageobjects;

import com.ctg.driver.DriverManager;
import com.ctg.pages.BasePage;

public class ConcertPage extends BasePage{

	public ConcertPage(DriverManager driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void goToAddConcert() {
		driver.getDriver().get("http://localhost:8000/addConcert");
		
	}
	
	

}
