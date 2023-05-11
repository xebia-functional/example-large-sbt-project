package com.xebia.functional.examplelargehttp4s

import cats.effect.{IO, IOApp}

object Project200Main extends IOApp.Simple:
  val run = Examplelargehttp4sServer.run[IO]
