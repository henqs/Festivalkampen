<<<<<<< HEAD
// @SOURCE:C:/Users/svett_000/Documents/GitHub/testApp/conf/routes
// @HASH:aec515a0e33bedd442435e5ca0371b7945bc4e60
// @DATE:Tue May 12 11:47:50 CEST 2015
=======
// @SOURCE:C:/Users/Henrik/Desktop/activator-1.3.2-minimal/testApp/conf/routes
// @HASH:02ef395f184ca7f3a7a23e9fb79eb3186205fa7b
// @DATE:Fri May 08 15:36:57 CEST 2015
>>>>>>> origin/master


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
        

// @LINE:24
private[this] lazy val controllers_Application_quiz6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("views/Quiz.scala.html"))))
private[this] lazy val controllers_Application_quiz6_invoker = createInvoker(
controllers.Application.quiz(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "quiz", Nil,"GET", """ Spelhub page""", Routes.prefix + """views/Quiz.scala.html"""))
        

// @LINE:27
private[this] lazy val controllers_Application_quizStart7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("views/QuizStartsida.scala.html"))))
private[this] lazy val controllers_Application_quizStart7_invoker = createInvoker(
controllers.Application.quizStart(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "quizStart", Nil,"GET", """ Spelhub page""", Routes.prefix + """views/QuizStartsida.scala.html"""))
        

<<<<<<< HEAD
// @LINE:30
private[this] lazy val controllers_Application_getTeamStandings8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getTeamStandings"))))
private[this] lazy val controllers_Application_getTeamStandings8_invoker = createInvoker(
controllers.Application.getTeamStandings(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getTeamStandings", Nil,"GET", """ Get current team standings for pie chart""", Routes.prefix + """getTeamStandings"""))
        

// @LINE:33
private[this] lazy val controllers_Application_updateUserTable9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateUserTable"))))
private[this] lazy val controllers_Application_updateUserTable9_invoker = createInvoker(
=======
// @LINE:31
private[this] lazy val controllers_Application_updateUserTable8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateUserTable"))))
private[this] lazy val controllers_Application_updateUserTable8_invoker = createInvoker(
>>>>>>> origin/master
controllers.Application.updateUserTable(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateUserTable", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """ Update user table""", Routes.prefix + """updateUserTable"""))
        

<<<<<<< HEAD
// @LINE:36
private[this] lazy val controllers_Application_givePoints10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("givePoints"))))
private[this] lazy val controllers_Application_givePoints10_invoker = createInvoker(
=======
// @LINE:34
private[this] lazy val controllers_Application_givePoints9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("givePoints"))))
private[this] lazy val controllers_Application_givePoints9_invoker = createInvoker(
>>>>>>> origin/master
controllers.Application.givePoints(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "givePoints", Seq(classOf[String], classOf[String]),"GET", """ Give user points""", Routes.prefix + """givePoints"""))
        

<<<<<<< HEAD
// @LINE:39
private[this] lazy val controllers_Assets_at11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at11_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/login.scala.html""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/gruppsida.scala.html""","""controllers.Application.gruppSida()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/kontakta.scala.html""","""controllers.Application.kontakta()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/spelhub.scala.html""","""controllers.Application.spelhub()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/Quiz.scala.html""","""controllers.Application.quiz()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/QuizStartsida.scala.html""","""controllers.Application.quizStart()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getTeamStandings""","""controllers.Application.getTeamStandings()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateUserTable""","""controllers.Application.updateUserTable(id:String, gender:String, name:String, email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """givePoints""","""controllers.Application.givePoints(id:String, points:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
=======
// @LINE:37
private[this] lazy val controllers_Assets_at10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at10_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/login.scala.html""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/gruppsida.scala.html""","""controllers.Application.gruppSida()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/kontakta.scala.html""","""controllers.Application.kontakta()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/spelhub.scala.html""","""controllers.Application.spelhub()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/Quiz.scala.html""","""controllers.Application.quiz()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/QuizStartsida.scala.html""","""controllers.Application.quizStart()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateUserTable""","""controllers.Application.updateUserTable(id:String, gender:String, name:String, email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """givePoints""","""controllers.Application.givePoints(id:String, points:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
>>>>>>> origin/master
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
        

// @LINE:24
case controllers_Application_quiz6_route(params) => {
   call { 
        controllers_Application_quiz6_invoker.call(controllers.Application.quiz())
   }
}
        

// @LINE:27
case controllers_Application_quizStart7_route(params) => {
   call { 
        controllers_Application_quizStart7_invoker.call(controllers.Application.quizStart())
<<<<<<< HEAD
=======
   }
}
        

// @LINE:31
case controllers_Application_updateUserTable8_route(params) => {
   call(params.fromQuery[String]("id", None), params.fromQuery[String]("gender", None), params.fromQuery[String]("name", None), params.fromQuery[String]("email", None)) { (id, gender, name, email) =>
        controllers_Application_updateUserTable8_invoker.call(controllers.Application.updateUserTable(id, gender, name, email))
   }
}
        

// @LINE:34
case controllers_Application_givePoints9_route(params) => {
   call(params.fromQuery[String]("id", None), params.fromQuery[String]("points", None)) { (id, points) =>
        controllers_Application_givePoints9_invoker.call(controllers.Application.givePoints(id, points))
>>>>>>> origin/master
   }
}
        

<<<<<<< HEAD
// @LINE:30
case controllers_Application_getTeamStandings8_route(params) => {
   call { 
        controllers_Application_getTeamStandings8_invoker.call(controllers.Application.getTeamStandings())
   }
}
        

// @LINE:33
case controllers_Application_updateUserTable9_route(params) => {
   call(params.fromQuery[String]("id", None), params.fromQuery[String]("gender", None), params.fromQuery[String]("name", None), params.fromQuery[String]("email", None)) { (id, gender, name, email) =>
        controllers_Application_updateUserTable9_invoker.call(controllers.Application.updateUserTable(id, gender, name, email))
   }
}
        

// @LINE:36
case controllers_Application_givePoints10_route(params) => {
   call(params.fromQuery[String]("id", None), params.fromQuery[String]("points", None)) { (id, points) =>
        controllers_Application_givePoints10_invoker.call(controllers.Application.givePoints(id, points))
   }
}
        

// @LINE:39
case controllers_Assets_at11_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at11_invoker.call(controllers.Assets.at(path, file))
=======
// @LINE:37
case controllers_Assets_at10_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at10_invoker.call(controllers.Assets.at(path, file))
>>>>>>> origin/master
   }
}
        
}

}
     