package controllers;


import models.Tick;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class Application extends Controller {

    public static Result index() {
        Tick tick = new Tick("Hello from the Application Controller");
        tick.save();
        List<Tick> ticks = new Model.Finder(Long.class, Tick.class).all();
        return ok(views.html.index.render(ticks));
    }

}