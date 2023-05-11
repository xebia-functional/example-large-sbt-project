package com.xebia.functional.examplelargehttp4s

import cats.effect.{IO, IOApp}

object Project134Main extends IOApp.Simple:
  val run = Examplelargehttp4sServer.run[IO]
