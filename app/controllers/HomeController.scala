package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class HomeController extends Controller {

  def index = Action {
    Ok("hello, world")
  }

}
