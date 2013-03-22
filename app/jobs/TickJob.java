package jobs;

import models.Tick;
import play.api.DefaultApplication;
import play.api.Play;
import play.api.Mode;
import play.api.Application;

import java.io.File;


public class TickJob {
    
    public static void main(String[] args) {

        Application application = new DefaultApplication(new File(args[0]), TickJob.class.getClassLoader(), null, Mode.Prod());

        Play.start(application);

        Tick tick = new Tick("Hello from the TickJob");
        tick.save();
    }

}
