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
	  
	  	  public static Result gruppSidaR() {
	    return ok(gruppsidaR.render());
	  }
	  
	  	  public static Result gruppSidaB() {
	    return ok(gruppsidaB.render());
	  }
	  
	  	  public static Result gruppSidaSvart() {
	    return ok(gruppsidaSvart.render());
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
	  
	  	  public static Result quizAvslut() {
	    return ok(quizAvslut.render());
	  }
	  ////////////////////////////Hämtar en användares lag//////////////////////////////77
	  	public static Result getTeam(String userID){

			Connection conn = null;
			Statement stmt = null;
			String getUserTeam = "SELECT team FROM `user` WHERE id="+userID;
			System.out.println("Nu kör vi " +  userID);
							
		  
		  try{
		      conn = DB.getConnection();
		      stmt = conn.createStatement();
			  
		      ResultSet rts = stmt.executeQuery(getUserTeam);
			  rts.next();
		      String str = rts.getString("team");
			  rts.close();
		      return ok("" + str);
   
		  }catch(SQLException se){
				//Handle errors for JDBC
		        return null;
			}finally{
				 //finally block used to close resources
				 try{
				    if(stmt!=null)
				       conn.close();
				 }catch(SQLException se){
				 }// do nothing
				 try{
				    if(conn!=null)
				       conn.close();
				 }catch(SQLException se){
				 }//end finally try
		   	}//end try
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
	  
	  public static Result checkQrStatus(String id){
	      Connection conn = null;
		  Statement stmt = null;
		  String qrStatus = "";
		  String getUserInfo = "SELECT * FROM `user` WHERE id="+id;
		  try {
				conn = DB.getConnection();
				stmt = conn.createStatement();
				ResultSet rsu = stmt.executeQuery(getUserInfo);
			    while(rsu.next()){
			        qrStatus += ""+rsu.getInt("qr10");
			        qrStatus += "-"+rsu.getInt("qr20");
			        qrStatus += "_"+rsu.getInt("qr30");
			    }
		  } catch (SQLException se) {

			}
			return ok(qrStatus);
	  }
	  
	  public static Result changeQrStatus(String id, String qrCode){
	      Connection conn = null;
		  Statement stmt = null;
		  String changeQrStatus = "UPDATE `user` SET `qr"+qrCode+"`='1' WHERE id="+id;
		  try {
				conn = DB.getConnection();
				stmt = conn.createStatement();
				stmt.executeUpdate(changeQrStatus);
		  }catch (SQLException se) {
                System.out.println("Could not update QR-status");
		    }
		return ok(qrCode);
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
    
    public static Result javascriptRoutes() {
    response().setContentType("text/javascript");
    return ok(
      Routes.javascriptRouter("jsRoutes",
        // Routes
        controllers.routes.javascript.Application.updateUserTable(),
        controllers.routes.javascript.Application.givePoints(),
        controllers.routes.javascript.Application.getTeamStandings(),
		controllers.routes.javascript.Application.getTeam(),
		controllers.routes.javascript.Application.checkQrStatus(),
        controllers.routes.javascript.Application.changeQrStatus(),
        controllers.routes.javascript.QuizController.sayHello()

      )
    );
  }

	public static void testPush() {
		// do nothing
	}
}
