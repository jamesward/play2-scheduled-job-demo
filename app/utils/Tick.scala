package utils

import play.api.Logger

class Tick {

  def tock(): Unit = {
    Logger.info("tick tock")
  }

}
