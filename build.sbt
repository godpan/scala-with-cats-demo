name := "scala-with-cats-demo"

version := "0.1"

scalaVersion := "2.13.1"

lazy val commonDependencies = Seq(
  "org.typelevel" %% "cats-core" % "2.0.0",
  "org.scalatest" %% "scalatest" % "3.0.8"
)

lazy val commonSettings = Seq(
  scalacOptions ++= compilerOptions,
  libraryDependencies ++= commonDependencies
)

lazy val global = project
  .in(file("."))
  .aggregate(
    common,
    chapter1,
    chapter2
  )

lazy val common = project
  .in(file("common"))
  .settings(commonSettings: _*)

lazy val chapter1 = project
  .in(file("chapter1"))
  .settings(commonSettings: _*)
  .dependsOn(common)

lazy val chapter2 = project
  .in(file("chapter2"))
  .settings(commonSettings: _*)
  .dependsOn(common)

lazy val compilerOptions = Seq(
  "-unchecked",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-deprecation",
  "-encoding",
  "utf8"
)

//(scalafmtOnCompile in ThisBuild) := true
//(compile in Compile) := {
//  (compile in Compile).dependsOn(scalafmtSbt in Compile).value
//}
