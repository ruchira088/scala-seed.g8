import sbt._

object Dependencies
{
  val ScalaVersion = "2.13.14"

  lazy val kindProjector = "org.typelevel" %% "kind-projector" % "0.13.3" cross CrossVersion.full

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.18"

  lazy val pegdown = "org.pegdown" % "pegdown" % "1.6.0"
}