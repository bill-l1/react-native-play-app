// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bill/onboarding/play-samples-play-java-starter-example/conf/rand.routes
// @DATE:Wed Jan 06 00:53:19 EST 2021

package rand

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  RandomController_0: v1.rand.RandomController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    RandomController_0: v1.rand.RandomController
  ) = this(errorHandler, RandomController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    rand.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, RandomController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """v1.rand.RandomController.list(request:Request, results:Int ?= 20)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val v1_rand_RandomController_list0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val v1_rand_RandomController_list0_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      RandomController_0.list(fakeValue[play.mvc.Http.Request], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "rand",
      "v1.rand.RandomController",
      "list",
      Seq(classOf[play.mvc.Http.Request], classOf[Int]),
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case v1_rand_RandomController_list0_route(params@_) =>
      call(params.fromQuery[Int]("results", Some(20))) { (results) =>
        v1_rand_RandomController_list0_invoker.call(
          req => RandomController_0.list(req, results))
      }
  }
}
