scalaVersion := "2.11.6"

name := "Akka Streams"

libraryDependencies ++= Seq(
          "com.typesafe.akka" %% "akka-actor" % "2.3.11",
          "ch.qos.logback" % "logback-classic" % "1.1.2",
          "com.typesafe.akka" % "akka-stream-experimental_2.11" % "1.0-RC2"
)
