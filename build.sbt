name := "Nitro"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
)

// for debugging sbt problems
//logLevel := Level.Debug

scalacOptions += "-deprecation"