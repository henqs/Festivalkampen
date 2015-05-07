package controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import models.quiz_question_choice;
import models.quiz_user_answer;
import play.api.data.Form;
import play.api.libs.*;
import play.db.ebean.Model;
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

	//   @BodyParser.Of(BodyParser.Json.class)
	//   public Result sayHello() {
	//   JsonNode json = request().body().asJson();
	//}

	public static Result sayHello(String data) {
		System.out.println(data +"rahim");
		idata = Integer.parseInt(data);
		return ok(data);
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

	public static Result registreraSvar(){
		quiz_user_answer quiz = new quiz_user_answer();
		quiz.user_id = 1;
		quiz.question_id = i+1;
		quiz.choice_id = idata;

		Calendar cal = Calendar.getInstance();
		quiz.answer_time = cal.getTime();
		quiz.save();
		return Application.index();
	}


public static Result getSvarsalternativ(){
	ArrayList<String> allaAlternativ = new ArrayList<String>();
	List<quiz_question_choice> qqaL = (List<quiz_question_choice>) new Model.Finder(int.class, quiz_question_choice.class).where();
	
		
	
	return ok(qqaL.choice);
}
}