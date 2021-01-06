
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name:String)(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Hello")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
  """),format.raw/*4.3*/("""<section id="top">
    <div class="wrapper">
      <h1>Hello """),_display_(/*6.18*/name),format.raw/*6.22*/("""</h1>
    </div>
  </section>
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(name:String,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(name)(assetsFinder)

  def f:((String) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (name) => (assetsFinder) => apply(name)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-01-05T21:22:03.732893
                  SOURCE: /Users/bill/onboarding/play-samples-play-java-starter-example/app/views/hello.scala.html
                  HASH: f734bf041bd7e0bcfe9b1ad1482dfba66858a88e
                  MATRIX: 920->1|1064->52|1091->54|1112->67|1151->69|1180->72|1268->134|1292->138|1352->169
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|36->6|36->6|39->9
                  -- GENERATED --
              */
          