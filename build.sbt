envFileName in ThisBuild := ".env"
Test / envFileName := "test.env"
envVars in Test := (envFromFile in Test).value

testFrameworks += new TestFramework("weaver.framework.TestFramework")

//Scenario A
//If you don't do anything special, it won't load the values
//from .env nor test.env and one of the test will fail

//Scenario B
//If you set fork in test true it will load the variables from
//test.env but not from .env and the tests will succeed
fork in Test := true

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "4.10.4" % "test",
  "com.disneystreaming" %% "weaver-framework" % "0.5.0" % "test"
)
