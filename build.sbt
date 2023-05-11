val Http4sVersion = "1.0.0-M29"
val MunitVersion = "0.7.29"
val LogbackVersion = "1.2.6"
val MunitCatsEffectVersion = "1.0.6"

ThisBuild / scalaVersion := "3.1.0"

lazy val root = (project in file("."))
  .settings(
    organization := "com.xebia.functional",
    name := "example-large-http4s",
    version := "0.0.1-SNAPSHOT",
    publish / skip := true
  )
  .aggregate(
    `joke-http4s`,
    `hello-world-http4s`,
    routes,
    mains
  )

lazy val `joke-http4s` = (project in file("./joke-http4s")).settings(
  name := "joke-http4s",
  libraryDependencies ++= Seq(
    "org.http4s" %% "http4s-ember-server" % Http4sVersion,
    "org.http4s" %% "http4s-ember-client" % Http4sVersion,
    "org.http4s" %% "http4s-circe" % Http4sVersion,
    "org.http4s" %% "http4s-dsl" % Http4sVersion,
    "org.scalameta" %% "munit" % MunitVersion % Test,
    "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test,
    "ch.qos.logback" % "logback-classic" % LogbackVersion
  ),
  testFrameworks += new TestFramework("munit.Framework")
)

lazy val `hello-world-http4s` =
  (project in file("./hello-world-http4s")).settings(
    name := "hello-world-http4s",
    libraryDependencies ++= Seq(
      "org.http4s" %% "http4s-ember-server" % Http4sVersion,
      "org.http4s" %% "http4s-ember-client" % Http4sVersion,
      "org.http4s" %% "http4s-circe" % Http4sVersion,
      "org.http4s" %% "http4s-dsl" % Http4sVersion,
      "org.scalameta" %% "munit" % MunitVersion % Test,
      "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test,
      "ch.qos.logback" % "logback-classic" % LogbackVersion
    ),
    testFrameworks += new TestFramework("munit.Framework")
  )

lazy val routes = (project in file("./routes"))
  .settings(
    name := "routes"
  )
  .dependsOn(`hello-world-http4s`, `joke-http4s`)

lazy val mains = (project in file("./mains")).settings(name := "mains").dependsOn(routes)
