import play.PlayJava

name := """play-java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "javax.json" % "javax.json-api" % "1.0",
  "org.springframework" % "spring-aop" % "4.0.3.RELEASE",
  "org.springframework" % "spring-expression" % "4.0.3.RELEASE",
  "org.springframework" % "spring-test" % "4.0.3.RELEASE",
  "org.springframework" % "spring-jdbc" % "4.0.3.RELEASE"
)