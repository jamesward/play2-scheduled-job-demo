package modules

import javax.inject.{Inject, Singleton}

import akka.actor.ActorSystem
import com.google.inject.AbstractModule
import play.api.inject.ApplicationLifecycle
import utils.Tick

import scala.concurrent.{ExecutionContext, Future}
import scala.concurrent.duration._

@Singleton
class TickScheduler @Inject() (tick: Tick, actorSystem: ActorSystem, lifecycle: ApplicationLifecycle) (implicit ec: ExecutionContext) {

  val scheduledTick = actorSystem.scheduler.schedule(Duration.Zero, 1.second) {
    tick.tock()
  }

  lifecycle.addStopHook { () =>
    scheduledTick.cancel()
    Future.successful(Unit)
  }

}

class TickSchedulerModule extends AbstractModule {
  override def configure() = {
    bind(classOf[TickScheduler]).asEagerSingleton()
  }
}
