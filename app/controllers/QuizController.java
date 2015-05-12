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
	
	String s = getFraga();
	ok(quiz.render(getFraga(),alt1,alt2,alt3,alt4));
	getSvarsalternativ();
	return ok(quiz.render(s,alt1,alt2,alt3,alt4));
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
 	if(allaFrågor.size() == i+1){
 		i = 0;
 		nu = 0;
 		
 	}
 	
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
 
 	for(quiz_question_choice q : qqaL){
 		if(q.choice_id == quiz.choice_id){
 			quiz.is_right = q.is_right_choice;
 		}
 	}
 	
 	Calendar cal = Calendar.getInstance();
 	quiz.answer_time = cal.getTime();
 	quiz.save();
 	i++;
 	return redirect(routes.QuizController.quiz());
 }
 private static void getSvarsalternativ(){
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
  		alt4 = svarsalternativ.get(3);
  }
 public static Result raderaSvar(){
	 List<quiz_user_answer> qqaA = quiz_user_answer.find.all();
	 for(quiz_user_answer q: qqaA){
		 if(q.user_id == 1){
			 q.delete();
		 }
	 }
	 i = 0;
	 return redirect(routes.QuizController.quiz());
 }
}