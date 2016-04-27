import bintray.Keys._

// Import default settings. This changes `publishTo` settings to use the Sonatype repository and add several commands for publishing.
sonatypeSettings

sbtPlugin := true

name := "play-qdsl"

organization := "com.infostroy.play"

version := "0.1.0"

publishMavenStyle := false

bintrayPublishSettings

repository in bintray := "sbt-plugins"

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization in bintray := None

/// Dependencies

libraryDependencies ++= Seq(
  "com.querydsl" % "querydsl-apt" % "4.1.0",
  "org.hibernate.javax.persistence" % "hibernate-jpa-2.0-api" % "1.0.1.Final"
)


