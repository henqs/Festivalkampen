// @SOURCE:C:/Users/Henrik/Desktop/activator-1.3.2-minimal/testApp/conf/routes
// @HASH:619df895b3c8fe75d8998db343ce83faed289833
// @DATE:Fri May 08 14:34:31 CEST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:30
class ReverseAssets {


// @LINE:30
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:15
def gruppSida(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "views/gruppsida.scala.html")
}
                        

// @LINE:21
def spelhub(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "views/spelhub.scala.html")
}
                        

// @LINE:18
def kontakta(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "views/kontakta.scala.html")
}
                        

// @LINE:24
def updateUserTable(id:String, gender:String, name:String, email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "updateUserTable" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)), Some(implicitly[QueryStringBindable[String]].unbind("gender", gender)), Some(implicitly[QueryStringBindable[String]].unbind("name", name)), Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                        

// @LINE:27
def givePoints(id:String, points:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "givePoints" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)), Some(implicitly[QueryStringBindable[String]].unbind("points", points)))))
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:9
def javascriptRoutes(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/routes")
}
                        

// @LINE:12
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "views/login.scala.html")
}
                        

}
                          
}
                  


// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:30
class ReverseAssets {


// @LINE:30
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:15
def gruppSida : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.gruppSida",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "views/gruppsida.scala.html"})
      }
   """
)
                        

// @LINE:21
def spelhub : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.spelhub",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "views/spelhub.scala.html"})
      }
   """
)
                        

// @LINE:18
def kontakta : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.kontakta",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "views/kontakta.scala.html"})
      }
   """
)
                        

// @LINE:24
def updateUserTable : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateUserTable",
   """
      function(id,gender,name,email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateUserTable" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("gender", gender), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("name", name), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)])})
      }
   """
)
                        

// @LINE:27
def givePoints : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.givePoints",
   """
      function(id,points) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "givePoints" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("points", points)])})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/routes"})
      }
   """
)
                        

// @LINE:12
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "views/login.scala.html"})
      }
   """
)
                        

}
              
}
        


// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:30
class ReverseAssets {


// @LINE:30
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:15
def gruppSida(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.gruppSida(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "gruppSida", Seq(), "GET", """ Grupp page""", _prefix + """views/gruppsida.scala.html""")
)
                      

// @LINE:21
def spelhub(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.spelhub(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "spelhub", Seq(), "GET", """ Spelhub page""", _prefix + """views/spelhub.scala.html""")
)
                      

// @LINE:18
def kontakta(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.kontakta(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "kontakta", Seq(), "GET", """ Kontakta page""", _prefix + """views/kontakta.scala.html""")
)
                      

// @LINE:24
def updateUserTable(id:String, gender:String, name:String, email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateUserTable(id, gender, name, email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateUserTable", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """ Update user table""", _prefix + """updateUserTable""")
)
                      

// @LINE:27
def givePoints(id:String, points:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.givePoints(id, points), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "givePoints", Seq(classOf[String], classOf[String]), "GET", """ Give user points""", _prefix + """givePoints""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "javascriptRoutes", Seq(), "GET", """ JS routes""", _prefix + """assets/javascripts/routes""")
)
                      

// @LINE:12
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "GET", """ Login page""", _prefix + """views/login.scala.html""")
)
                      

}
                          
}
        
    