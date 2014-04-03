import play.GlobalSettings;
import play.Logger;

public class Global extends GlobalSettings {
	
	private boolean isWebApplication(play.Application app) {
		return app.configuration().getBoolean("application.web");
	}
	
	private boolean isTickJob(play.Application app) {
		return app.configuration().getBoolean("application.scheduledtick");
	}

	@Override
	public void onStart(play.Application app) {
		if (isWebApplication(app)) {
			Logger.debug("Global.onStart() called from the Web Application");
		}
		
		if (isTickJob(app)) {
			Logger.debug("Global.onStart() called from the TickJob");
		}
	}
}
