import sbt._

object Dependencies
{
  val ScalaVersion = "2.13.9"

  lazy val kindProjector = "org.typelevel" %% "kind-projector" % "0.13.2" cross CrossVersion.full

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.13"

  lazy val pegdown = "org.pegdown" % "pegdown" % "1.6.0"
}