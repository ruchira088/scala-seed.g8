import sbt._

object Dependencies
{
  val SCALA_VERSION = "2.13.1"

  lazy val kindProjector = "org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.1.0"

  lazy val pegdown = "org.pegdown" % "pegdown" % "1.6.0"
}
