seq(conscriptSettings :_*)

organization := "net.numa08"

name := "halley"

version := "0.1.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
 "com.twitter" % "util-eval_2.10" % "6.10.0",
 "org.scalatest" % "scalatest_2.10" % "2.0" % "test",
 "org.jsoup" % "jsoup" % "1.7.3"
 )
 