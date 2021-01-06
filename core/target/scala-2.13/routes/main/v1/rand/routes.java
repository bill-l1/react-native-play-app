// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bill/onboarding/play-samples-play-java-starter-example/conf/rand.routes
// @DATE:Wed Jan 06 00:53:19 EST 2021

package v1.rand;

import rand.RoutesPrefix;

public class routes {
  
  public static final v1.rand.ReverseRandomController RandomController = new v1.rand.ReverseRandomController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final v1.rand.javascript.ReverseRandomController RandomController = new v1.rand.javascript.ReverseRandomController(RoutesPrefix.byNamePrefix());
  }

}
