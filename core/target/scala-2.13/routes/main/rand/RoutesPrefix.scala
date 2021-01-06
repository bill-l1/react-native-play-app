// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bill/onboarding/play-samples-play-java-starter-example/conf/rand.routes
// @DATE:Wed Jan 06 00:53:19 EST 2021


package rand {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
