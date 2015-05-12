package controllers;



import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.node.ObjectNode;






import models.quiz_question;
import models.quiz_question_choice;
import play.*;
import play.data.Form;
import play.db.DB;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;
import play.libs.Json;
import play.mvc.*;
import views.html.*;
import static play.libs.Json.toJson;



public class Application extends Controller {
	
	 
    public static Result index() {
        
    	
    	return ok(index.render("QUIZ"));
    }
  
}

