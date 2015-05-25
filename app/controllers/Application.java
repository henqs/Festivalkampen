package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;
import java.util.ArrayList;
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
	  static int newUserTeam = 0;
	  
	  public static Result index() {
	    return ok(index.render());
	  }
	  
	  public static Result login() {
	    return ok(login.render());
	  }

	  public static Result gruppSida() {
	    return ok(gruppsida.render());
	  }
	  public static Result photoFeed() {
	      return ok(photofeed.render());
	  }

	public static Result kontakta() {
	    return ok(kontakta.render());
	  }
	  
	  	public static Result spelhub() {
	    return ok(spelhub.render());
	  }
	  
	  	  	public static Result gruppAktivitet() {
	    return ok(gruppAktivitet.render());
	  }
	  
	  public static Result quizStart() {
	    return ok(QuizStartsida.render());
	  }
	  public static Result upload() {
        MultipartFormData body = request().body().asMultipartFormData();
        FilePart picture = body.getFile("picture");
        if (picture != null) {
            String fileName = picture.getFilename();
            String contentType = picture.getContentType(); 
            File file = picture.getFile();
            System.out.println(fileName);
            file.renameTo(new File("public/photos", fileName));
            insertPicture(fileName);
            return ok(photofeed.render());
        } else {
            flash("error", "Missing file");
            return redirect(routes.Application.index());
        }
}
	   public static Result getTeamStandings() {
	      Connection conn = null;
		  Statement stmt = null;
		  int redPoints = 0;
		  int bluePoints = 0;
		  int blackPoints = 0;
		  int currentTeamId = -1;
		  String getTeamStandings = "SELECT * FROM `team`";
		  try{
		      conn = DB.getConnection();
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(getTeamStandings);
		      while(rs.next()){
		          currentTeamId = rs.getInt("id");
		          if(currentTeamId == 0){
		              redPoints = rs.getInt("points");
		          }else if(currentTeamId == 1){
		              bluePoints = rs.getInt("points");
		          }else if(currentTeamId == 2){
		              blackPoints = rs.getInt("points");
		          }
		      }
		  }catch (SQLException se) {

		  }
	    return ok(""+redPoints+"_"+bluePoints+"-"+blackPoints+"+");
	  }
	  
	  public static Result givePoints(String id, String points){
	        Connection conn = null;
		    Statement stmt = null;
			String idValueString = "";
			int teamId = 0;
			int userPointValue = 0;
			int teamPointValue = 0;
	        String getUserInfo = "SELECT * FROM `user` WHERE id="+id;
			try {
				conn = DB.getConnection();
				stmt = conn.createStatement();
				ResultSet rsu = stmt.executeQuery(getUserInfo);
			    while(rsu.next()){
			        idValueString = rsu.getString("id");
			        userPointValue = rsu.getInt("points");
			        teamId = rsu.getInt("team");
			    }
			    String getTeamInfo = "SELECT * FROM `team` WHERE id="+teamId;
			    stmt.executeQuery(getTeamInfo);
			    ResultSet rst = stmt.executeQuery(getTeamInfo);
			    while(rst.next()){
			        teamPointValue = rst.getInt("points");
			    }
			    int pointsToAdd = Integer.parseInt(points);
			    int newTotalPoints = userPointValue+pointsToAdd;
			    int teamNewTotalPoints = teamPointValue+pointsToAdd;
				String insertIntoDatabaseUser = "";
				String insertIntoDatabaseTeam = "";
	            if(idValueString.equals(id)){
	                insertIntoDatabaseUser = "UPDATE `user` SET `points`='"+newTotalPoints+"' WHERE id="+id;
	                insertIntoDatabaseTeam = "UPDATE `team` SET `points`='"+teamNewTotalPoints+"' WHERE id="+teamId;
	            }else{
	                insertIntoDatabaseUser = "";
	            }
				// execute insert SQL stetement
				System.out.println(insertIntoDatabaseUser);
				System.out.println(insertIntoDatabaseTeam);
				stmt.executeUpdate(insertIntoDatabaseUser);
				stmt.executeUpdate(insertIntoDatabaseTeam);
			} catch (SQLException se) {
                System.out.println("Something went wrong when updating points");
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
	                newUserTeam++;
	                int thisUserTeam = newUserTeam%3;
	                insertIntoDatabase = "INSERT INTO `user`(`id`, `gender`, `name`, `email`, `team`) VALUES ('"+id+"','"+genderChar+"','"+name+"','"+email+"','"+thisUserTeam+"')";
	            }
				// execute insert SQL stetement
				System.out.println(insertIntoDatabase);
				stmt.executeUpdate(insertIntoDatabase);
			} catch (SQLException se) {

			}
			return ok(ajax_result.render(id));
		}
    
    public static Result insertPicture(String fileName){
        Connection conn = null;
		Statement stmt = null;
		int attempts = 0;
        String insertIntoDatabase = "INSERT INTO `picture`(`filename`) VALUES ('"+fileName+"')";
        boolean success = false;
        while(success == false && attempts < 75){
            try {
			    conn = DB.getConnection();
			    stmt = conn.createStatement();
			    stmt.executeUpdate(insertIntoDatabase);
			    System.out.println(insertIntoDatabase);
			    success = true;
            }catch (SQLException se) {
                System.out.println("Something went wrong when saving file. Retrying...");
                attempts++;
		    }
        }
		return ok(ajax_result.render(fileName));
    }
    public static Result javascriptRoutes() {
    response().setContentType("text/javascript");
    return ok(
      Routes.javascriptRouter("jsRoutes",
        // Routes
        controllers.routes.javascript.Application.updateUserTable(),
        controllers.routes.javascript.Application.givePoints(),
        controllers.routes.javascript.Application.getTeamStandings(),
        controllers.routes.javascript.Application.getPhotos(),
        controllers.routes.javascript.QuizController.sayHello()
      )
    );
  }
  public static Result getPhotos(String id){
      Connection conn = null;
	  Statement stmt = null;
	  String getPhotoNames = "SELECT `filename` FROM `picture` WHERE id="+id;
	  String photos = "";
	  boolean success = false;
	  int attempts = 0;
	  while(success == false && attempts < 75){
      try{
		  conn = DB.getConnection();
		  stmt = conn.createStatement();
		  ResultSet rs = stmt.executeQuery(getPhotoNames);
		  while(rs.next()){
			       photos = rs.getString("filename");
			    }
		  success = true;
      }catch (SQLException se){
          System.out.println("Failed to load photo. Retrying...");
          attempts++;
      }
	  }
      return ok(photos);
  }

	public static void testPush() {
		// do nothing
	}
}
