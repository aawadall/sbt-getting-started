name := "sbt-getting-started"

version := "0.1"

scalaVersion := "2.13.7"

lazy val root = project.in(file("."))
    .aggregate(calculators)

lazy val calculators = project