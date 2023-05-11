package com.xebia.functional.examplelargehttp4s

import cats.effect.{IO, IOApp}

object Project47Main extends IOApp.Simple:
  val run = Examplelargehttp4sServer.run[IO]
