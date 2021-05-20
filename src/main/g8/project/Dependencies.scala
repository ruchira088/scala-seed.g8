import sbt._

object Dependencies
{
  val ScalaVersion = "2.13.6"

  lazy val kindProjector = "org.typelevel" %% "kind-projector" % "0.13.0" cross CrossVersion.full

  lazy val scalaTypedHoles = "com.github.cb372" % "scala-typed-holes" % "0.1.9" cross CrossVersion.full

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.9"

  lazy val pegdown = "org.pegdown" % "pegdown" % "1.6.0"
}