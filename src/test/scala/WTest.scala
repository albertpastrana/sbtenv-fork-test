import scala.util.Properties

object WTest extends weaver.SimpleIOSuite {

  pureTest("env variable from .env") {
    expect(Properties.envOrNone("IN_DOTENV").isEmpty)
  }

  pureTest("env variable from test.env") {
    expect(Properties.envOrNone("IN_TEST_ENV").contains("ho"))
  }

}
