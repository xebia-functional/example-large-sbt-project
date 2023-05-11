package com.xebia.functional.examplelargehttp4s

import cats.effect.{IO, IOApp}

object Project68Main extends IOApp.Simple:
  val run = Examplelargehttp4sServer.run[IO]
