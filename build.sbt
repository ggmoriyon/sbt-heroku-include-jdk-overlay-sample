name := """sbt-heroku-include-jdk-overlay-sample"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

herokuAppName in Compile := "agile-lowlands-8903"

herokuJdkVersion in Compile := "1.8"

herokuIncludePaths in Compile := Seq(
  ".jdk-overlay"
)
