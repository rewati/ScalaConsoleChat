name := "ScalaConsoleChat"

version := "1.0"

scalaVersion := "2.11.8"

lazy val http4sVersion = "0.15.0-SNAPSHOT"

// Only necessary for SNAPSHOT releases
resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "2.2.6",
  "org.scalatest" %% "scalatest" % "2.2.6",
  "org.scalaj" %% "scalaj-http" % "2.3.0"
)