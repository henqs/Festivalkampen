package controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import models.quiz_question;
import models.quiz_question_choice;
import models.quiz_user_answer;
import play.api.data.Form;
import play.api.libs.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import play.*;
import play.mvc.BodyParser;

import com.fasterxml.jackson.databind.JsonNode;

import play.libs.Json;



	public class QuizController extends Controller{
		
		static int i = 0;
		static int idata;
		static String alt1,alt2,alt3,alt4;

 //   @BodyParser.Of(BodyParser.Json.class)
 //   public Result sayHello() {
 //   JsonNode json = request().body().asJson();
//}
public static Result quiz(){
	getSvarsalternativ();
	return ok(quiz.render(getFraga(),alt1,alt2,alt3,alt4));
}
public static Result sayHello(String data) {
    idata = Integer.parseInt(data);
    return ok();
}

 public static Result javascriptRoutes() {
    response().setContentType("text/javascript");
    return ok(
      Routes.javascriptRouter("jsRoutes",
        // Routes
        controllers.routes.javascript.QuizController.sayHello()
      )
    );
  }
 private static String getFraga(){
 	ArrayList<String> allaFrågor = new ArrayList<String>();
 	List<quiz_question> qq = quiz_question.find.all();
 	int nu = i;
 	for(quiz_question q : qq){
 		String fråga = q.getQuestion();
 		allaFrågor.add(fråga);
 	}
 	if(allaFrågor.size() == i){
 		i = 0;
 		nu = 0;
 	}
 	i++;
 	return allaFrågor.get(nu);
 }
 public static Result registreraSvar(){
 	quiz_user_answer quiz = new quiz_user_answer();
 	List<quiz_question_choice> qqaL = quiz_question_choice.finder.all();
 	ArrayList<Integer> alternativFrågor = new ArrayList<Integer>();
 	for(quiz_question_choice q : qqaL){
 		if(i+1 == q.question_id){
 			alternativFrågor.add(q.choice_id);
 		}
 	}
 	quiz.user_id = 1;
 	quiz.question_id = i+1;
 	
 	quiz.choice_id = alternativFrågor.get(idata);
 	
 	Calendar cal = Calendar.getInstance();
 	quiz.answer_time = cal.getTime();
 	rättaSvaret();
 	quiz.save();
 	return redirect(routes.QuizController.quiz());
 }
 private static Result getSvarsalternativ(){
	   ArrayList<String> svarsalternativ = new ArrayList<String>();
	   List<quiz_question_choice> qqaL = quiz_question_choice.finder.all();
  	for(quiz_question_choice q : qqaL){
  		if(q.question_id == i+1){
  			svarsalternativ.add(q.choice);
  		}
  	}
  		alt1 = svarsalternativ.get(0);
  		alt2 = svarsalternativ.get(1);
  		alt3 = svarsalternativ.get(2);
  		
  		
  		
  		return ok();
  }
 private static void rättaSvaret(){
	 ArrayList<String> svaren = new ArrayList<String>();
	 List<quiz_question_choice> qqaL = quiz_question_choice.finder.all();
	 for(quiz_question_choice q : qqaL){
		 if(q.choice_id == idata){
			 
		 }
	 }
 }
}