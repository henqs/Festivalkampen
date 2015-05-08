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
	    //givePoints("628246407306132", "55");
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
	    public static Result givePoints(String id, String points){
	        Connection conn = null;
			Statement stmt = null;
			String idValueString = "";
			int pointValue = 0;
	        String getId = "SELECT * FROM `user` WHERE id="+id;
			try {
				conn = DB.getConnection();
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(getId);
			    while(rs.next()){
			        idValueString = rs.getString("id");
			        pointValue = rs.getInt("points");
			    }
			    int pointsToAdd = Integer.parseInt(points);
			    int newTotalPoints = pointValue+pointsToAdd;
				String insertIntoDatabase = "";
	            if(idValueString.equals(id)){
	                insertIntoDatabase = "UPDATE `user` SET `points`='"+newTotalPoints+"' WHERE id="+id;
	            }else{
	                insertIntoDatabase = "";
	            }
				// execute insert SQL stetement
				System.out.println(insertIntoDatabase);
				stmt.executeUpdate(insertIntoDatabase);
			} catch (SQLException se) {

			}
			return ok(ajax_result.render(id));
		}
//	// Create user and send to database
		public static Result updateUserTable(String id, String gender, String name, String email) {
			Connection conn = null;
			Statement stmt = null;
			String idValueString = "";
	        String getId = "SELECT `id` FROM `user` WHERE id="+id;
			try {
				conn = DB.getConnection();
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(getId);
			    while(rs.next()){
			        idValueString = rs.getString("id");
			    }
				String insertIntoDatabase = "";
				char genderChar = gender.charAt(0);
	            if(idValueString.equals(id)){
	                insertIntoDatabase = "UPDATE `user` SET `id`= '"+id+"',`gender`='"+genderChar+"',`name`='"+name+"',`email`='"+email+"' WHERE id="+id;
	            }else{
	                insertIntoDatabase = "INSERT INTO `user`(`id`, `gender`, `name`, `email`) VALUES ('"+id+"','"+genderChar+"','"+name+"','"+email+"')";
	            }
				// execute insert SQL stetement
				System.out.println(insertIntoDatabase);
				stmt.executeUpdate(insertIntoDatabase);
			} catch (SQLException se) {

			}
			return ok(ajax_result.render(id));
		}
    
    public static Result javascriptRoutes() {
    response().setContentType("text/javascript");
    return ok(
      Routes.javascriptRouter("jsRoutes",
        // Routes
        controllers.routes.javascript.Application.updateUserTable(),
        controllers.routes.javascript.Application.givePoints()
      )
    );
  }

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
