// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bill/onboarding/play-samples-play-java-starter-example/conf/rand.routes
// @DATE:Wed Jan 06 00:53:19 EST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package v1.rand {

  // @LINE:1
  class ReverseRandomController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def list(results:Int = 20): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(results == 20) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("results", results)))))
    }
  
  }


}
