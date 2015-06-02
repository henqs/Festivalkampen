package controllers;

import play.*;
import play.mvc.*;

import org.apache.commons.io.FileUtils;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.*;

import java.util.*;
import java.sql.*;
import models.quiz_question;
import models.quiz_question_choice;
import models.quiz_user_answer;

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
	  
	  static ArrayList<String> quizDataList = new ArrayList<String>();
	  
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
	    return ok(quizStartsida.render());
	  }
	  
	  public static Result quizKlarsida(){
		  return ok(quizKlarsida.render());
	  }
	  
	  public static Result quizAvslut() {
	    return ok(quizAvslut.render());
	  }
	  public static Result quizInteInloggad(){
		  return ok(quizInteInloggad.render());
	  }
	  public static Result fotoSida() {
	    return ok(fotoSida.render());
	  }
	  public static Result quizBegin(){
		  String s1, s2, s3, s4, s5;
		  s1 = quizDataList.get(0);
		  s2 = quizDataList.get(1);
		  s3 = quizDataList.get(2);
		  s4 = quizDataList.get(3);
		  s5 = quizDataList.get(4);
		  return ok(quiz.render(s1, s2, s3, s4, s5));
	  }
	  public static void getQuizData(String s1, String s2, String s3, String s4, String s5){
		  quizDataList.clear();
		  quizDataList.add(s1);
		  quizDataList.add(s2);
		  quizDataList.add(s3);
		  quizDataList.add(s4);
		  quizDataList.add(s5);
	  }
	  
	  public static Result taId(String id) {
			System.out.println(id);
			List<quiz_user_answer> qqa = quiz_user_answer.find.all();
			  
			  for(quiz_user_answer q : qqa){
				  if(q.user_id == Long.parseLong(id)){
				  	return ok("1");
				  }
			  }
			  return ok("0");
		}
/*	  public static Result uploadProductImage(
        Http.MultipartFormData body
) {
    Http.MultipartFormData.FilePart image = body.getFile("image");

    if (image != null) {
        String fileName = image.getFilename();
        File file = image.getFile();
        try {
            FileUtils.moveFile(file, new File("public/images/products", fileName));
        } catch (IOException ioe) {
            System.out.println("Problem operating on filesystem");
        }
    }
    return products();
}*/
private static final String DIRECTORY = Play.application().path()+"";

        public static Result getDirectory(){
            return ok(""+DIRECTORY);
        }
	  public static Result upload(/*String userFullName, String userId*/) {
	      System.out.println(DIRECTORY);
        MultipartFormData body = request().body().asMultipartFormData();
        FilePart picture = body.getFile("picture");
        if (picture != null) {
            String fileName = picture.getFilename();
            String contentType = picture.getContentType(); 
            File file = picture.getFile();
            System.out.println(fileName);
           // file.renameTo(new File("public/photos", fileName));
            try {
                FileUtils.moveFile(file, new File("../../..", fileName));
                System.out.println(DIRECTORY+"/public/photos");
            } catch (IOException ioe) {
                System.out.println("Something went wrong when moving file!");
                return redirect(routes.Application.index());
            }
            //insertPicture(fileName, userFullName, userId);
            return ok(photofeed.render());
        } else {
            flash("error", "Missing file");
            return redirect(routes.Application.index());
        }
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
    
	 public static Result insertPicture(String fileName, String userFullName, String userId){
        Connection conn = null;
		Statement stmt = null;
		int attempts = 0;
        String insertIntoDatabase = "INSERT INTO `picture`(`filename`, `userFullName`, `userId`) VALUES ('"+fileName+"', '"+userFullName+"', '"+userId+"')";
        boolean success = false;
        while(success == false && attempts < 10){
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
	
	public static Result getPhotos(String id){
      Connection conn = null;
	  Statement stmt = null;
	  String getPhotoInfo = "SELECT * FROM `picture` WHERE id="+id;
	  String photo = "";
	  String fullName = "";
	  boolean success = false;
	  int attempts = 0;
	  //while(success == false && attempts < 10){
      try{
		  conn = DB.getConnection();
		  stmt = conn.createStatement();
		  ResultSet rs = stmt.executeQuery(getPhotoInfo);
		  while(rs.next()){
			       photo = rs.getString("filename");
			       fullName = rs.getString("userFullName");
			    }
		  success = true;
      }catch (SQLException se){
          System.out.println("Failed to load photo. Retrying...");
          attempts++;
      }
	  //}
      return ok(photo+"/"+fullName);
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
		controllers.routes.javascript.Application.getPhotos(),
		controllers.routes.javascript.Application.getDirectory(),
		controllers.routes.javascript.Application.insertPicture(),
		controllers.routes.javascript.Application.upload(),
        controllers.routes.javascript.QuizController.sayHello(),
		controllers.routes.javascript.Application.taId(),
        controllers.routes.javascript.QuizController.quiz()

      )
    );
  }

	public static void testPush() {
		// do nothing
	}
}
