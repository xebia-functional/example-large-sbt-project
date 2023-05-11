# example-large-http4s

Large project with 200 subprojects with mains.

To test sbt performance:

```shell
JAVA_OPTS="-Xmx8G" sbt -Dsbt.traces=true -Dsbt.task.timings=true -Dsbt.task.timings.on.shutdown=true ";clean;Test / compile"
```

See ``timingsCleanCompileOutput.txt` for the current timings.

Actual task traces can be found after the above build in `target/traces/build.traces`. Load in Chrome's trace viewer at chrome://tracings
