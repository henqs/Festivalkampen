package controllers;

import play.*;
import play.mvc.*;

import java.sql.*;

import models.User;
import views.html.*;
import play.data.Form;
import play.db.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.libs.Json;
import play.*;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	  
	  public static Result index() {
	   //Här kan man testköra updateUserTable().
	   return ok(index.render());
	  }
	  
	  public static Result login() {
		return ok(login.render());
	  }
	  
//	  public static Result javascriptRoutes() {
//		    response().setContentType("text/javascript");
//		    return ok(
//		        Routes.javascriptRouter("jsRoutes",
//		            controllers.routes.javascript.Projects.add(),
//		            controllers.routes.javascript.Projects.delete(),
//		            controllers.routes.javascript.Projects.rename(),
//		            controllers.routes.javascript.Projects.addGroup()
//		        )
//		    );
//		}
	
//	// Create user and send to database
		public static void userTableUpdate(int id, char gender, String name, String email) {
	        ObjectNode result = Json.newObject();
			Connection conn = null;
			Statement stmt = null;
			int idValue = -1;
	        String getId = "SELECT `id` FROM `user` WHERE id="+id;
			try {
				conn = DB.getConnection();
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(getId);
			    while(rs.next()){
			        idValue = rs.getInt("id");
			    }
			    System.out.println(""+idValue);
				String insertIntoDatabase = "";
	            if(idValue == id){
	                insertIntoDatabase = "UPDATE `user` SET `id`= '"+id+"',`gender`='"+gender+"',`name`='"+name+"',`email`='"+email+"' WHERE id="+id;
	            }else{
	                insertIntoDatabase = "INSERT INTO `user`(`id`, `gender`, `name`, `email`) VALUES ('"+id+"','"+gender+"','"+name+"','"+email+"')";
	            }
				// execute insert SQL stetement
				stmt.executeUpdate(insertIntoDatabase);
			} catch (SQLException se) {

			}
		}

				// user.save();
			//	return redirect(routes.Application.newUserPage());
//			} catch (SQLException se) {
//				// Handle errors for JDBC
//				return internalServerError(se.toString());
//			} catch (Exception e) {
//				// Handle errors for Class.forName
//				return internalServerError(e.toString());
//			} finally {
//				// finally block used to close resources
//				try {
//					if (stmt != null)
//						conn.close();
//				} catch (SQLException se) {
//				}// do nothing
//				try {
//					if (conn != null)
//						conn.close();
//				} catch (SQLException se) {
//					return internalServerError(se.toString());
//				}// end finally try
//			}// end try


	public static Result getName() {

		ObjectNode result = Json.newObject();
		Connection connection = null;
		Statement statement = null;

		try {

			connection = DB.getConnection();
			statement = connection.createStatement();

			String sql = "SELECT * FROM testTabellPlsIgnore";

			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				int ålder = rs.getInt("ålder");
				String namn = rs.getString("namn");
				ObjectNode test = Json.newObject();
				test.put("Name", namn);
				test.put("Age", ålder);

				result.put(namn, ålder);
			}

			rs.close();

			return ok(result);

		} catch (SQLException se) {
			// Handle errors for JDBC
			return internalServerError(se.toString());
		} catch (Exception e) {
			// Handle errors for Class.forName
			return internalServerError(e.toString());
		} finally {
			// finally block used to close resources
			try {
				if (statement != null)
					connection.close();
			} catch (SQLException se) {
			}// do nothing
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				return internalServerError(se.toString());
			}// end finally try
		}// end try

	}

	public static void testPush() {
		// do nothing
	}
}
