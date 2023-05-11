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
    project1,
    project2,
    project3,
    project4,
    project5,
    project6,
    project7,
    project8,
    project9,
    project10,
    project11,
    project12,
    project13,
    project14,
    project15,
    project16,
    project17,
    project18,
    project19,
    project20,
    project21,
    project22,
    project23,
    project24,
    project25,
    project26,
    project27,
    project28,
    project29,
    project30,
    project31,
    project32,
    project33,
    project34,
    project35,
    project36,
    project37,
    project38,
    project39,
    project40,
    project41,
    project42,
    project43,
    project44,
    project45,
    project46,
    project47,
    project48,
    project49,
    project50,
    project51,
    project52,
    project53,
    project54,
    project55,
    project56,
    project57,
    project58,
    project59,
    project60,
    project61,
    project62,
    project63,
    project64,
    project65,
    project66,
    project67,
    project68,
    project69,
    project70,
    project71,
    project72,
    project73,
    project74,
    project75,
    project76,
    project77,
    project78,
    project79,
    project80,
    project81,
    project82,
    project83,
    project84,
    project85,
    project86,
    project87,
    project88,
    project89,
    project90,
    project91,
    project92,
    project93,
    project94,
    project95,
    project96,
    project97,
    project98,
    project99,
    project100,
    project101,
    project102,
    project103,
    project104,
    project105,
    project106,
    project107,
    project108,
    project109,
    project110,
    project111,
    project112,
    project113,
    project114,
    project115,
    project116,
    project117,
    project118,
    project119,
    project120,
    project121,
    project122,
    project123,
    project124,
    project125,
    project126,
    project127,
    project128,
    project129,
    project130,
    project131,
    project132,
    project133,
    project134,
    project135,
    project136,
    project137,
    project138,
    project139,
    project140,
    project141,
    project142,
    project143,
    project144,
    project145,
    project146,
    project147,
    project148,
    project149,
    project150,
    project151,
    project152,
    project153,
    project154,
    project155,
    project156,
    project157,
    project158,
    project159,
    project160,
    project161,
    project162,
    project163,
    project164,
    project165,
    project166,
    project167,
    project168,
    project169,
    project170,
    project171,
    project172,
    project173,
    project174,
    project175,
    project176,
    project177,
    project178,
    project179,
    project180,
    project181,
    project182,
    project183,
    project184,
    project185,
    project186,
    project187,
    project188,
    project189,
    project190,
    project191,
    project192,
    project193,
    project194,
    project195,
    project196,
    project197,
    project198,
    project199,
    project200
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

lazy val project1 =
  (project in file("./project1"))
    .settings(
      libraryDependencies ++=
        Seq(
          "org.scalameta" %% "munit" % MunitVersion % Test,
          "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
        )
    )
    .dependsOn(routes)
lazy val project2 =
  (project in file("./project2"))
    .settings(
      libraryDependencies ++=
        Seq(
          "org.scalameta" %% "munit" % MunitVersion % Test,
          "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
        )
    )
    .dependsOn(routes)
lazy val project3 =
  (project in file("./project3"))
    .settings(
      libraryDependencies ++=
        Seq(
          "org.scalameta" %% "munit" % MunitVersion % Test,
          "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
        )
    )
    .dependsOn(routes)
lazy val project4 =
  (project in file("./project4"))
    .settings(
      libraryDependencies ++=
        Seq(
          "org.scalameta" %% "munit" % MunitVersion % Test,
          "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
        )
    )
    .dependsOn(routes)
lazy val project5 =
  (project in file("./project5"))
    .settings(
      libraryDependencies ++=
        Seq(
          "org.scalameta" %% "munit" % MunitVersion % Test,
          "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
        )
    )
    .dependsOn(routes)
lazy val project6 =
  (project in file("./project6"))
    .settings(
      libraryDependencies ++=
        Seq(
          "org.scalameta" %% "munit" % MunitVersion % Test,
          "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
        )
    )
    .dependsOn(routes)
lazy val project7 =
  (project in file("./project7"))
    .settings(
      libraryDependencies ++=
        Seq(
          "org.scalameta" %% "munit" % MunitVersion % Test,
          "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
        )
    )
    .dependsOn(routes)
lazy val project8 =
  (project in file("./project8"))
    .settings(
      libraryDependencies ++=
        Seq(
          "org.scalameta" %% "munit" % MunitVersion % Test,
          "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
        )
    )
    .dependsOn(routes)
lazy val project9 =
  (project in file("./project9"))
    .settings(
      libraryDependencies ++=
        Seq(
          "org.scalameta" %% "munit" % MunitVersion % Test,
          "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
        )
    )
    .dependsOn(routes)
lazy val project10 = (project in file("./project10"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project11 = (project in file("./project11"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project12 = (project in file("./project12"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project13 = (project in file("./project13"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project14 = (project in file("./project14"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project15 = (project in file("./project15"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project16 = (project in file("./project16"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project17 = (project in file("./project17"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project18 = (project in file("./project18"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project19 = (project in file("./project19"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project20 = (project in file("./project20"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project21 = (project in file("./project21"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project22 = (project in file("./project22"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project23 = (project in file("./project23"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project24 = (project in file("./project24"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project25 = (project in file("./project25"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project26 = (project in file("./project26"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project27 = (project in file("./project27"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project28 = (project in file("./project28"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project29 = (project in file("./project29"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project30 = (project in file("./project30"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project31 = (project in file("./project31"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project32 = (project in file("./project32"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project33 = (project in file("./project33"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project34 = (project in file("./project34"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project35 = (project in file("./project35"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project36 = (project in file("./project36"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project37 = (project in file("./project37"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project38 = (project in file("./project38"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project39 = (project in file("./project39"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project40 = (project in file("./project40"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project41 = (project in file("./project41"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project42 = (project in file("./project42"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project43 = (project in file("./project43"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project44 = (project in file("./project44"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project45 = (project in file("./project45"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project46 = (project in file("./project46"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project47 = (project in file("./project47"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project48 = (project in file("./project48"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project49 = (project in file("./project49"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project50 = (project in file("./project50"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project51 = (project in file("./project51"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project52 = (project in file("./project52"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project53 = (project in file("./project53"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project54 = (project in file("./project54"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project55 = (project in file("./project55"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project56 = (project in file("./project56"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project57 = (project in file("./project57"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project58 = (project in file("./project58"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project59 = (project in file("./project59"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project60 = (project in file("./project60"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project61 = (project in file("./project61"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project62 = (project in file("./project62"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project63 = (project in file("./project63"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project64 = (project in file("./project64"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project65 = (project in file("./project65"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project66 = (project in file("./project66"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project67 = (project in file("./project67"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project68 = (project in file("./project68"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project69 = (project in file("./project69"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project70 = (project in file("./project70"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project71 = (project in file("./project71"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project72 = (project in file("./project72"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project73 = (project in file("./project73"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project74 = (project in file("./project74"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project75 = (project in file("./project75"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project76 = (project in file("./project76"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project77 = (project in file("./project77"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project78 = (project in file("./project78"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project79 = (project in file("./project79"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project80 = (project in file("./project80"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project81 = (project in file("./project81"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project82 = (project in file("./project82"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project83 = (project in file("./project83"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project84 = (project in file("./project84"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project85 = (project in file("./project85"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project86 = (project in file("./project86"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project87 = (project in file("./project87"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project88 = (project in file("./project88"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project89 = (project in file("./project89"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project90 = (project in file("./project90"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project91 = (project in file("./project91"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project92 = (project in file("./project92"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project93 = (project in file("./project93"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project94 = (project in file("./project94"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project95 = (project in file("./project95"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project96 = (project in file("./project96"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project97 = (project in file("./project97"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project98 = (project in file("./project98"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project99 = (project in file("./project99"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project100 = (project in file("./project100"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project101 = (project in file("./project101"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project102 = (project in file("./project102"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project103 = (project in file("./project103"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project104 = (project in file("./project104"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project105 = (project in file("./project105"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project106 = (project in file("./project106"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project107 = (project in file("./project107"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project108 = (project in file("./project108"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project109 = (project in file("./project109"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project110 = (project in file("./project110"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project111 = (project in file("./project111"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project112 = (project in file("./project112"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project113 = (project in file("./project113"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project114 = (project in file("./project114"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project115 = (project in file("./project115"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project116 = (project in file("./project116"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project117 = (project in file("./project117"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project118 = (project in file("./project118"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project119 = (project in file("./project119"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project120 = (project in file("./project120"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project121 = (project in file("./project121"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project122 = (project in file("./project122"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project123 = (project in file("./project123"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project124 = (project in file("./project124"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project125 = (project in file("./project125"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project126 = (project in file("./project126"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project127 = (project in file("./project127"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project128 = (project in file("./project128"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project129 = (project in file("./project129"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project130 = (project in file("./project130"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project131 = (project in file("./project131"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project132 = (project in file("./project132"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project133 = (project in file("./project133"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project134 = (project in file("./project134"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project135 = (project in file("./project135"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project136 = (project in file("./project136"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project137 = (project in file("./project137"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project138 = (project in file("./project138"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project139 = (project in file("./project139"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project140 = (project in file("./project140"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project141 = (project in file("./project141"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project142 = (project in file("./project142"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project143 = (project in file("./project143"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project144 = (project in file("./project144"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project145 = (project in file("./project145"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project146 = (project in file("./project146"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project147 = (project in file("./project147"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project148 = (project in file("./project148"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project149 = (project in file("./project149"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project150 = (project in file("./project150"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project151 = (project in file("./project151"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project152 = (project in file("./project152"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project153 = (project in file("./project153"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project154 = (project in file("./project154"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project155 = (project in file("./project155"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project156 = (project in file("./project156"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project157 = (project in file("./project157"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project158 = (project in file("./project158"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project159 = (project in file("./project159"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project160 = (project in file("./project160"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project161 = (project in file("./project161"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project162 = (project in file("./project162"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project163 = (project in file("./project163"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project164 = (project in file("./project164"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project165 = (project in file("./project165"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project166 = (project in file("./project166"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project167 = (project in file("./project167"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project168 = (project in file("./project168"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project169 = (project in file("./project169"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project170 = (project in file("./project170"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project171 = (project in file("./project171"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project172 = (project in file("./project172"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project173 = (project in file("./project173"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project174 = (project in file("./project174"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project175 = (project in file("./project175"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project176 = (project in file("./project176"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project177 = (project in file("./project177"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project178 = (project in file("./project178"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project179 = (project in file("./project179"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project180 = (project in file("./project180"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project181 = (project in file("./project181"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project182 = (project in file("./project182"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project183 = (project in file("./project183"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project184 = (project in file("./project184"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project185 = (project in file("./project185"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project186 = (project in file("./project186"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project187 = (project in file("./project187"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project188 = (project in file("./project188"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project189 = (project in file("./project189"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project190 = (project in file("./project190"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project191 = (project in file("./project191"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project192 = (project in file("./project192"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project193 = (project in file("./project193"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project194 = (project in file("./project194"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project195 = (project in file("./project195"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project196 = (project in file("./project196"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project197 = (project in file("./project197"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project198 = (project in file("./project198"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project199 = (project in file("./project199"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
lazy val project200 = (project in file("./project200"))
  .settings(
    libraryDependencies ++=
      Seq(
        "org.scalameta" %% "munit" % MunitVersion % Test,
        "org.typelevel" %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test
      )
  )
  .dependsOn(routes)
