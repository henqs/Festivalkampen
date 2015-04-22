package controllers;

import java.sql.*;

import play.*;
import play.libs.Json;
import play.api.db.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	
	 Connection conn = null;
	 Statement statement = null;
	 ResultSet result = null;

    public static Result index() {
    	
    	 try {
    		 conn = DB.getConnection();
    		 stmt = conn.createStatement();
    
//    		 String insertIntoDatabase = "INSERT INTO user"
//    				 + "(username, password) "
//    				 + "hej"+ "dåligtlösneord";
//    		 stmt.executeUpdate(insertIntoDatabase);
    		 
    		 statement = conn.createStatement();
    	
    	 String sql = "SELECT * FROM user";
    	 return ok(index.render(sql.toString()));

    }catch(Exception e){

      return ok(index.render(e.toString()));

   }
   
  //      return ok(index.render("Hej"));
    }
    
    public static void testPush() {
        //do nothing
    }
}
