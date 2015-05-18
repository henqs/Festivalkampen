// @SOURCE:C:/Users/Henrik/Desktop/activator-1.3.2-minimal/testApp/conf/routes
// @HASH:2ea6eae7198f44a6679788033585d628b39c5ff0
// @DATE:Mon May 18 13:10:40 CEST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Application_javascriptRoutes1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascripts/routes"))))
private[this] lazy val controllers_Application_javascriptRoutes1_invoker = createInvoker(
controllers.Application.javascriptRoutes(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "javascriptRoutes", Nil,"GET", """ JS routes""", Routes.prefix + """assets/javascripts/routes"""))
        

// @LINE:12
private[this] lazy val controllers_Application_login2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("views/login.scala.html"))))
private[this] lazy val controllers_Application_login2_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """ Login page""", Routes.prefix + """views/login.scala.html"""))
        

// @LINE:15
private[this] lazy val controllers_Application_gruppSida3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("views/gruppsida.scala.html"))))
private[this] lazy val controllers_Application_gruppSida3_invoker = createInvoker(
controllers.Application.gruppSida(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "gruppSida", Nil,"GET", """ Grupp page""", Routes.prefix + """views/gruppsida.scala.html"""))
        

// @LINE:18
private[this] lazy val controllers_Application_kontakta4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("views/kontakta.scala.html"))))
private[this] lazy val controllers_Application_kontakta4_invoker = createInvoker(
controllers.Application.kontakta(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "kontakta", Nil,"GET", """ Kontakta page""", Routes.prefix + """views/kontakta.scala.html"""))
        

// @LINE:21
private[this] lazy val controllers_Application_spelhub5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("views/spelhub.scala.html"))))
private[this] lazy val controllers_Application_spelhub5_invoker = createInvoker(
controllers.Application.spelhub(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "spelhub", Nil,"GET", """ Spelhub page""", Routes.prefix + """views/spelhub.scala.html"""))
        

// @LINE:23
private[this] lazy val controllers_QuizController_quiz6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("views/quiz.scala.html"))))
private[this] lazy val controllers_QuizController_quiz6_invoker = createInvoker(
controllers.QuizController.quiz(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.QuizController", "quiz", Nil,"GET", """""", Routes.prefix + """views/quiz.scala.html"""))
        

// @LINE:26
private[this] lazy val controllers_Application_gruppAktivitet7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("views/gruppAktivitet.scala.html"))))
private[this] lazy val controllers_Application_gruppAktivitet7_invoker = createInvoker(
controllers.Application.gruppAktivitet(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "gruppAktivitet", Nil,"GET", """ Spelhub page""", Routes.prefix + """views/gruppAktivitet.scala.html"""))
        

// @LINE:29
private[this] lazy val controllers_Application_quizStart8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("views/QuizStartsida.scala.html"))))
private[this] lazy val controllers_Application_quizStart8_invoker = createInvoker(
controllers.Application.quizStart(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "quizStart", Nil,"GET", """ Spelhub page""", Routes.prefix + """views/QuizStartsida.scala.html"""))
        

// @LINE:32
private[this] lazy val controllers_Application_getTeamStandings9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getTeamStandings"))))
private[this] lazy val controllers_Application_getTeamStandings9_invoker = createInvoker(
controllers.Application.getTeamStandings(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getTeamStandings", Nil,"GET", """ Get current team standings for pie chart""", Routes.prefix + """getTeamStandings"""))
        

// @LINE:35
private[this] lazy val controllers_Application_updateUserTable10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateUserTable"))))
private[this] lazy val controllers_Application_updateUserTable10_invoker = createInvoker(
controllers.Application.updateUserTable(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateUserTable", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """ Update user table""", Routes.prefix + """updateUserTable"""))
        

// @LINE:38
private[this] lazy val controllers_Application_givePoints11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("givePoints"))))
private[this] lazy val controllers_Application_givePoints11_invoker = createInvoker(
controllers.Application.givePoints(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "givePoints", Seq(classOf[String], classOf[String]),"GET", """ Give user points""", Routes.prefix + """givePoints"""))
        

// @LINE:41
private[this] lazy val controllers_QuizController_sayHello12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("postquiz"))))
private[this] lazy val controllers_QuizController_sayHello12_invoker = createInvoker(
controllers.QuizController.sayHello(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.QuizController", "sayHello", Seq(classOf[String]),"GET", """ skicka quiz-svar""", Routes.prefix + """postquiz"""))
        

// @LINE:43
private[this] lazy val controllers_QuizController_registreraSvar13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registrerasvar"))))
private[this] lazy val controllers_QuizController_registreraSvar13_invoker = createInvoker(
controllers.QuizController.registreraSvar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.QuizController", "registreraSvar", Nil,"POST", """""", Routes.prefix + """registrerasvar"""))
        

// @LINE:45
private[this] lazy val controllers_QuizController_raderaSvar14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("raderasvar"))))
private[this] lazy val controllers_QuizController_raderaSvar14_invoker = createInvoker(
controllers.QuizController.raderaSvar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.QuizController", "raderaSvar", Nil,"POST", """""", Routes.prefix + """raderasvar"""))
        

// @LINE:48
private[this] lazy val controllers_Assets_at15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at15_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/login.scala.html""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/gruppsida.scala.html""","""controllers.Application.gruppSida()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/kontakta.scala.html""","""controllers.Application.kontakta()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/spelhub.scala.html""","""controllers.Application.spelhub()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/quiz.scala.html""","""controllers.QuizController.quiz()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/gruppAktivitet.scala.html""","""controllers.Application.gruppAktivitet()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/QuizStartsida.scala.html""","""controllers.Application.quizStart()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getTeamStandings""","""controllers.Application.getTeamStandings()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateUserTable""","""controllers.Application.updateUserTable(id:String, gender:String, name:String, email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """givePoints""","""controllers.Application.givePoints(id:String, points:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postquiz""","""controllers.QuizController.sayHello(data:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registrerasvar""","""controllers.QuizController.registreraSvar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """raderasvar""","""controllers.QuizController.raderaSvar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:9
case controllers_Application_javascriptRoutes1_route(params) => {
   call { 
        controllers_Application_javascriptRoutes1_invoker.call(controllers.Application.javascriptRoutes())
   }
}
        

// @LINE:12
case controllers_Application_login2_route(params) => {
   call { 
        controllers_Application_login2_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:15
case controllers_Application_gruppSida3_route(params) => {
   call { 
        controllers_Application_gruppSida3_invoker.call(controllers.Application.gruppSida())
   }
}
        

// @LINE:18
case controllers_Application_kontakta4_route(params) => {
   call { 
        controllers_Application_kontakta4_invoker.call(controllers.Application.kontakta())
   }
}
        

// @LINE:21
case controllers_Application_spelhub5_route(params) => {
   call { 
        controllers_Application_spelhub5_invoker.call(controllers.Application.spelhub())
   }
}
        

// @LINE:23
case controllers_QuizController_quiz6_route(params) => {
   call { 
        controllers_QuizController_quiz6_invoker.call(controllers.QuizController.quiz())
   }
}
        

// @LINE:26
case controllers_Application_gruppAktivitet7_route(params) => {
   call { 
        controllers_Application_gruppAktivitet7_invoker.call(controllers.Application.gruppAktivitet())
   }
}
        

// @LINE:29
case controllers_Application_quizStart8_route(params) => {
   call { 
        controllers_Application_quizStart8_invoker.call(controllers.Application.quizStart())
   }
}
        

// @LINE:32
case controllers_Application_getTeamStandings9_route(params) => {
   call { 
        controllers_Application_getTeamStandings9_invoker.call(controllers.Application.getTeamStandings())
   }
}
        

// @LINE:35
case controllers_Application_updateUserTable10_route(params) => {
   call(params.fromQuery[String]("id", None), params.fromQuery[String]("gender", None), params.fromQuery[String]("name", None), params.fromQuery[String]("email", None)) { (id, gender, name, email) =>
        controllers_Application_updateUserTable10_invoker.call(controllers.Application.updateUserTable(id, gender, name, email))
   }
}
        

// @LINE:38
case controllers_Application_givePoints11_route(params) => {
   call(params.fromQuery[String]("id", None), params.fromQuery[String]("points", None)) { (id, points) =>
        controllers_Application_givePoints11_invoker.call(controllers.Application.givePoints(id, points))
   }
}
        

// @LINE:41
case controllers_QuizController_sayHello12_route(params) => {
   call(params.fromQuery[String]("data", None)) { (data) =>
        controllers_QuizController_sayHello12_invoker.call(controllers.QuizController.sayHello(data))
   }
}
        

// @LINE:43
case controllers_QuizController_registreraSvar13_route(params) => {
   call { 
        controllers_QuizController_registreraSvar13_invoker.call(controllers.QuizController.registreraSvar())
   }
}
        

// @LINE:45
case controllers_QuizController_raderaSvar14_route(params) => {
   call { 
        controllers_QuizController_raderaSvar14_invoker.call(controllers.QuizController.raderaSvar())
   }
}
        

// @LINE:48
case controllers_Assets_at15_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at15_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     