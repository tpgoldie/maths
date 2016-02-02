import sbt._

val scalatest = "org.scalatest" % "scalatest_2.11" % "3.0.0-M15"
val mockito = "org.mockito" % "mockito-core" % "1.9.0"

lazy val root = (project in file(".")).
  settings(
    name := "maths",
    version := "1.0",
    scalaVersion := "2.11.7",
    libraryDependencies ++= Seq(scalatest)
  )
