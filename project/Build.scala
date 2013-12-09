import sbt._
import play.Project._

object ApplicationBuild extends Build {
  val appName = "scalaWebLab"
  val appVersion = "0.1"
  val common = play.Project(
    appName + "-common", appVersion, path = file("modules/common")
  )

  val mainDeps = Seq()

  lazy  val main = play.Project(appName, appVersion, mainDeps).settings(
    // Add your own project settings here
  ).dependsOn(common).aggregate(common)
}