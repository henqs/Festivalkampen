// @SOURCE:C:/Users/svett_000/Documents/GitHub/testApp/conf/routes
// @HASH:0bd41c9ae3c9322066fffab9f09f3b24348bb20c
// @DATE:Thu May 07 14:50:18 CEST 2015


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
private[this] lazy val controllers_Application_updateUserTable3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateUserTable"))))
private[this] lazy val controllers_Application_updateUserTable3_invoker = createInvoker(
controllers.Application.updateUserTable(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateUserTable", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """ Update user table""", Routes.prefix + """updateUserTable"""))
        

// @LINE:18
private[this] lazy val controllers_Application_givePoints4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("givePoints"))))
private[this] lazy val controllers_Application_givePoints4_invoker = createInvoker(
controllers.Application.givePoints(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "givePoints", Seq(classOf[String], classOf[String]),"GET", """ Give user points""", Routes.prefix + """givePoints"""))
        

// @LINE:21
private[this] lazy val controllers_Assets_at5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/login.scala.html""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateUserTable""","""controllers.Application.updateUserTable(id:String, gender:String, name:String, email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """givePoints""","""controllers.Application.givePoints(id:String, points:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Application_updateUserTable3_route(params) => {
   call(params.fromQuery[String]("id", None), params.fromQuery[String]("gender", None), params.fromQuery[String]("name", None), params.fromQuery[String]("email", None)) { (id, gender, name, email) =>
        controllers_Application_updateUserTable3_invoker.call(controllers.Application.updateUserTable(id, gender, name, email))
   }
}
        

// @LINE:18
case controllers_Application_givePoints4_route(params) => {
   call(params.fromQuery[String]("id", None), params.fromQuery[String]("points", None)) { (id, points) =>
        controllers_Application_givePoints4_invoker.call(controllers.Application.givePoints(id, points))
   }
}
        

// @LINE:21
case controllers_Assets_at5_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     