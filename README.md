# sbtenv-fork-test

This project is just to illustrate some weird behaviour happening when using [sbt-dotenv](https://github.com/mefellows/sbt-dotenv) and trying to have a set of env variables defined for the test tasks.

After some tests, it looks like the tests tasks will only be able to see the environment variables if the tests are set to be forked (that is, if you set you set `fork in Test := true` ).

In order to test the above behaviour, you can load this project and run the tests. There are two scenarios in the `build.sbt` file that will show the different behaviours.

Note: during thoses tests, I've found some weird behaviour and sometimes I'd even see in green some tests I was expecting to be red, haven't been able to see a pattern. I recommend to always run the tests from the command line using `sbt clean test`.
