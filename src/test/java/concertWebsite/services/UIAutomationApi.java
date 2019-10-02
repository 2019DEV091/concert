package concertWebsite.services;

public class UIAutomationApi implements AutomationApi {
	
	private UINavigationFunctions navigationFunctions;
	private UIGoogleFunctions googleFunctions;
	private UIConcertFunctions concertFunctions;

	public UIAutomationApi(UINavigationFunctions navigationFunctions, UIGoogleFunctions googleFunctions, UIConcertFunctions concertFunctions) {
		super();
		this.navigationFunctions = navigationFunctions;
		this.googleFunctions = googleFunctions;
		this.concertFunctions = concertFunctions;
	}

	@Override
	public NavigationFunctions getNavigationFunctions() {
		return navigationFunctions;
	}

	@Override
	public GoogleFunctions getGoogleFunctions() {
		return googleFunctions;
	}

	@Override
	public ConcertFunctions getConcertFunctions() {
		return concertFunctions;
	}

}
