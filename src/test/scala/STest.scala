import scala.util.Properties

class STest extends org.specs2.mutable.Specification {

  "env variable from .env" >> {
    Properties.envOrNone("IN_DOTENV") must beNone
  }

  "env variable from test.env" >> {
    Properties.envOrNone("IN_TEST_ENV") must beSome("ho")
  }

}
