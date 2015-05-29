package controllers;


import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
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

import java.util.*;



	public class QuizController extends Controller{
		
		//static int idata;
		
		//static ArrayList<String> svarsalternativ;
		//static Map<Integer,quiz_user_answer> svaren = new HashMap<Integer,quiz_user_answer>();
		//static ArrayList<quiz_user_answer> svarAnvändare = new ArrayList<quiz_user_answer>();
		static HashMap<Long,Integer> idata = new HashMap<Long,Integer>();
		static HashMap<Long,ArrayList<quiz_user_answer>> svarAnvändare = new HashMap<Long,ArrayList<quiz_user_answer>>();
		static HashMap<Long,ArrayList<String>> svarsAlternativ = new HashMap<Long,ArrayList<String>>();
		static Map<Long,HashMap<Integer,quiz_user_answer>> svaren = new HashMap<Long,HashMap<Integer,quiz_user_answer>>();
		static Map<Long,Integer> koll = new HashMap<Long,Integer>();
		
 //   @BodyParser.Of(BodyParser.Json.class)
 //   public Result sayHello() {
 //   JsonNode json = request().body().asJson();
//}
		
public static Result quiz(String userId){
	
	if(koll.get(Long.parseLong(userId)) == null)
		datum(userId);
	String s = getFraga(userId);
	getSvarsalternativ(userId);
	Application.getQuizData(s,svarsAlternativ.get(Long.parseLong(userId)).get(0),svarsAlternativ.get(Long.parseLong(userId)).get(1),svarsAlternativ.get(Long.parseLong(userId)).get(2),svarsAlternativ.get(Long.parseLong(userId)).get(3));
	//Application.quizStart(s,svarsAlternativ.get(Long.parseLong(userId)).get(0),svarsAlternativ.get(Long.parseLong(userId)).get(1),svarsAlternativ.get(Long.parseLong(userId)).get(2),svarsAlternativ.get(Long.parseLong(userId)).get(3));
	//return ok(quiz.render(s,svarsAlternativ.get(Long.parseLong(userId)).get(0),svarsAlternativ.get(Long.parseLong(userId)).get(1),svarsAlternativ.get(Long.parseLong(userId)).get(2),svarsAlternativ.get(Long.parseLong(userId)).get(3)));
	return ok();
	
}
public static Result sayHello(String data, String userId) {
	int e = Integer.parseInt(data);
    idata.put(Long.parseLong(userId),e);
	
    return ok();
}

 //public static Result javascriptRoutes() {
 //   response().setContentType("text/javascript");
 //   return ok(
 //     Routes.javascriptRouter("jsRoutes",
        // Routes
 //       controllers.routes.javascript.QuizController.sayHello()
//      )
 //   );
//  }

 private static String getFraga(String userId){
 	ArrayList<String> allaFrågor = new ArrayList<String>();
 	List<quiz_question> qq = quiz_question.find.all();
 	
 	for(quiz_question q : qq){
 		String fråga = q.getQuestion();
 		allaFrågor.add(fråga);
 	}
 	
 	
 	return allaFrågor.get(koll.get(Long.parseLong(userId)));
 }
 public static Result registreraSvar(String userId){
 	quiz_user_answer quiz = new quiz_user_answer();
 	List<quiz_question_choice> qqaL = quiz_question_choice.finder.all();
 	List<quiz_user_answer> qqa = quiz_user_answer.find.all();
 	ArrayList<Integer> alternativFrågor = new ArrayList<Integer>();
 	for(String s : svarsAlternativ.get(Long.parseLong(userId))){
 		for(quiz_question_choice q : qqaL){
 			if(s.equals(q.choice)){
 				alternativFrågor.add(q.choice_id);
 			}
 		}
 	}
 	
 	if(userId != null){
 	quiz.user_id = Long.parseLong(userId);
 	}else{
 		
 	}
 	quiz.question_id = koll.get(Long.parseLong(userId))+1;
 	
 	
 	quiz.choice_id = alternativFrågor.get(idata.get(Long.parseLong(userId)));
 
 	for(quiz_question_choice q : qqaL){
 		if(q.choice_id == quiz.choice_id){
 			quiz.is_right = q.is_right_choice;
 		}
 	}
 	
 	Calendar cal = Calendar.getInstance();
 	quiz.answer_time = cal.getTime();
 	svaren.get(Long.parseLong(userId)).put(koll.get(Long.parseLong(userId)),quiz);
 	for(quiz_user_answer q : qqa){
 		if(quiz.user_id == q.user_id && quiz.question_id == q.question_id){
 			datum(userId);
 			
 			return redirect(routes.Application.quizAvslut());
 			}
 		}
 	
 	if((koll.get(Long.parseLong(userId))+1) % 8 == 0 && koll.get(Long.parseLong(userId)) != 0){
 		if(svarAnvändare.equals(svaren.get(Long.parseLong(userId)).values()) || svarAnvändare.get(Long.parseLong(userId)).isEmpty()){
 			for(quiz_user_answer qua: svaren.get(Long.parseLong(userId)).values()){
 				if(qua.is_right == 1){
 					Application.givePoints("" +qua.user_id,""+1);
 				}
 				svarAnvändare.get(Long.parseLong(userId)).add(qua);
 				qua.save();
 				
 				}
 			}
 		
 		return redirect(routes.Application.quizAvslut());
 	}
 	int e = koll.get(Long.parseLong(userId));
 	e++;
 	koll.put(Long.parseLong(userId),e);
 	quiz(userId);
 	return redirect(routes.Application.quizBegin());
 }
 private static void getSvarsalternativ(String userId){
	   ArrayList<String> list = new ArrayList<String>();
	   
	   List<quiz_question_choice> qqaL = quiz_question_choice.finder.all();
  	for(quiz_question_choice q : qqaL){
  		if(q.question_id == koll.get(Long.parseLong(userId))+1){
  			list.add(q.choice);
  		}
  	}
  		svarsAlternativ.put(Long.parseLong(userId),list);
  		Collections.shuffle(list);
  		
  		
  }
 
 public static Result tillbaka(String userId){
	 if(!(koll.get(Long.parseLong(userId)) % 8 == 0)){
		 int e = koll.get(Long.parseLong(userId));
		 e--;
		 koll.put(Long.parseLong(userId),e);
		 
	 }
	 quiz(userId);
	 return redirect(routes.Application.quizBegin());
 }
 private static void datum(String userId){
	 Calendar cal = Calendar.getInstance();
	 Date idag = cal.getTime();
	 
	 Date dd = new GregorianCalendar(2015, Calendar.JUNE, 10).getTime();
	 
	 koll.put(Long.parseLong(userId),0);
	 if(idag.before(dd)){
		 int e = koll.get(Long.parseLong(userId));
		 e = 0;
		 koll.put(Long.parseLong(userId),e);
		 svarsAlternativ.put(Long.parseLong(userId),new ArrayList<String>());
		 idata.put(Long.parseLong(userId),0);
		 svaren.put(Long.parseLong(userId), new HashMap<Integer,quiz_user_answer>());
		 svarAnvändare.put(Long.parseLong(userId),new ArrayList<quiz_user_answer>());

	 }else{
		
		 int e = koll.get(Long.parseLong(userId));
		 e = 8;
		 
		 koll.put(Long.parseLong(userId),e);
		 svarsAlternativ.put(Long.parseLong(userId),new ArrayList<String>());
		 idata.put(Long.parseLong(userId),0);
		 svaren.put(Long.parseLong(userId), new HashMap<Integer,quiz_user_answer>());
		 svarAnvändare.put(Long.parseLong(userId),new ArrayList<quiz_user_answer>());

	 }
	
 }

}