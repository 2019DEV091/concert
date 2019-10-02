package concertWebsite.picoContainer;

import concertWebsite.glue.hooks.UIHooks;
import concertWebsite.implementations.DebugConcerts;
import concertWebsite.implementations.DebugOrganizer;
import concertWebsite.services.UIAutomationApi;
import cucumber.runtime.java.picocontainer.PicoFactory;

public class CustomPicoFactory extends PicoFactory {
	
	public CustomPicoFactory() {
		defineImplementations();
	}
	
	
	private void defineImplementations() {
		String implementation = System.getProperty("test.implementation", "ui");
		
		switch (implementation) {
		case "debug":
			addClass(DebugConcerts.class);
			addClass(DebugOrganizer.class);
			break;
		case "ui":
			addClass(UIAutomationApi.class);
			addClass(UIHooks.class);
		default:
			break;
		}
		
	}


}
