// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bill/onboarding/play-samples-play-java-starter-example/conf/rand.routes
// @DATE:Wed Jan 06 00:53:19 EST 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package v1.rand.javascript {

  // @LINE:1
  class ReverseRandomController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "v1.rand.RandomController.list",
      """
        function(results0) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(results0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("results", results0))])})
        }
      """
    )
  
  }


}
