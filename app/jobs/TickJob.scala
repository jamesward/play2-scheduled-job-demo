package jobs

import modules.TickSchedulerModule
import play.api.inject.guice.GuiceApplicationBuilder
import utils.Tick

object TickJob extends App {

  val app = new GuiceApplicationBuilder(disabled = Seq(classOf[TickSchedulerModule])).build()

  val tick = app.injector.instanceOf[Tick]

  tick.tock()

  app.stop()

}
