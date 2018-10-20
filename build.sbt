scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.2.14",
  "org.typelevel" %% "cats-free" % "1.4.0",
  "org.scalacheck" %% "scalacheck" % "1.14.0",
  "org.scalatest" %% "scalatest" % "3.0.1",

  "org.scala-lang" % "scala-compiler" % scalaVersion.value // for REPLesent
)

scalacOptions ++= Seq("-language:_", "-feature", "-nowarn") // for REPLesent
