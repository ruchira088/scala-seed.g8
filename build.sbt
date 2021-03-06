
lazy val root = (project in file("."))
  .enablePlugins(ScriptedPlugin)
  .settings(
    name := "scala-seed",
    libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value,
    resolvers += "typesafe"at "https://repo.typesafe.com/typesafe/ivy-releases/"
  )
