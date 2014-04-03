import play.GlobalSettings;
import play.Logger;

public class Global extends GlobalSettings {

	private static final String WEB_PROCESS_TYPE = "web";
	private static final String SCHEDULED_TICK_PROCESS_TYPE = "scheduledtick";

	private boolean isWebApplication(play.Application app) {
		return app.configuration().getString("process.type")
				.equals(WEB_PROCESS_TYPE);
	}

	private boolean isTickJob(play.Application app) {
		return app.configuration().getString("process.type")
				.equals(SCHEDULED_TICK_PROCESS_TYPE);
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
