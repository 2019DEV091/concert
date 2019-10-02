package concertWebsite.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ctg.driver.DriverManager;
import com.ctg.pages.BasePage;

public class GooglePage extends BasePage {
	
	@FindBy(name="q")
	private WebElement inputField;
	
	@FindBy(css= "div.rc cite")
	private List<WebElement> results;

	public GooglePage(DriverManager driver) {
		super(driver);
	}
	
	public void clickAndEnterSomething(String something) {
		inputField.click();
		inputField.sendKeys(something);
	}

	public GooglePage goToGooglePage() {
		driver.getDriver().get("https://www.google.be");
		return this;
		
	}

	public String getUrlOfResult(int resultNumber) {
		return results.get(resultNumber-1).getText();
	}

}
