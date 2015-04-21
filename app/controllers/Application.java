package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import java.lang.Exception;
import java.sql.*;
import java.sql.DriverManager;
import views.html.*;


public class Application extends Controller {
	
	

    public static Result index() {
		Connection conn = null;
		Statement stmt = null;
		String result = "";
		
		 try {   
			 conn = DriverManager.getConnection
			("jdbc:mysql://mysql.dsv.su.se/servernamn",
					"Namn", "Lösenord");


     
        return ok(index.render("Hej"));
    }
    
    public static void testPush() {
        //do nothing
    }
}
