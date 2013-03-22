import sbt._
import Keys._
import play.Project
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play2-scheduled-job-demo"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    javaCore,
    javaJdbc,
    javaEbean,
    "postgresql" % "postgresql" % "9.1-901-1.jdbc4"
  )

  val main = Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
