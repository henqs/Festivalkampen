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
		
		return ok(index.render("Hej" + getName()));


	}
	
//	// Create user and send to database
		public static void addUser() {
	

			
			
			Connection conn = null;
			Statement stmt = null;

			try {
				conn = DB.getConnection();
				stmt = conn.createStatement();

				String insertIntoDatabase = "INSERT INTO `anek2876`.`testTabellPlsIgnore` (`ålder` , `namn`) VALUES ('456', 'Igen');";

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
