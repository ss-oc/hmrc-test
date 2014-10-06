name := "hmrc-test"

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"

libraryDependencies += "org.mockito" % "mockito-core" % "1.9.5" % "test"

mainClass := Some("uk.gov.hmrc.cli.Launcher")