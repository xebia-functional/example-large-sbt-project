package com.xebia.functional.examplelargehttp4s

import cats.effect.{IO, IOApp}

object Project43Main extends IOApp.Simple:
  val run = Examplelargehttp4sServer.run[IO]
