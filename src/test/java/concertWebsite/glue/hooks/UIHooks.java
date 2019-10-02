package concertWebsite.glue.hooks;

import static com.ctg.driver.DriverType.CHROME;

import com.ctg.driver.DriverManager;

import concertWebsite.services.Hookable;
import cucumber.api.Scenario;

public class UIHooks implements Hookable {
	
	private final DriverManager driver;
	

	public UIHooks(DriverManager driver) {
		super();
		this.driver = driver;
	}

	@Override
	public void setup() {
		driver.setDriver(CHROME);
		driver.maximizeBrowser();

	}

	@Override
	public void teardown(Scenario scenario) {
		driver.quit();

	}

}
