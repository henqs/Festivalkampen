package controllers;



import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.node.ObjectNode;





import models.quiz_question;
import play.*;
import play.data.Form;
import play.db.DB;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;
import play.libs.Json;
import play.mvc.*;
import views.html.*;
import static play.libs.Json.toJson;



public class Application extends Controller {
	
	static int i = 0;
	
    public static Result index() {
        
    
    	return ok();
    }
    
    public static Result quiz(){
        return ok(quizz.render());
    }
    
    public static Result postQuery(String query) {
    System.out.print(query);
    return TODO;
    }
    
//    public static Result addPerson(){
//    	Person person = Form.form(Person.class).bindFromRequest().get();
//    	
//    	person.id = i;
//    	person.save();
//    	i++;
//    	
//    	return redirect(routes.Application.index());//går tillbaka till start efter denna metod är körd
//   }
    
//    public static Result getPersons(){
//    	List<Person> persons = new Model.Finder(String.class,Person.class).all();//första parametern är typ av primärnyckeln och andra är typen
//    	return ok(toJson(persons));
//    }
    public static String getFraga(){
    	ArrayList<String> allaFrågor = new ArrayList<String>();
    	List<quiz_question> qq = quiz_question.find.all();
    	int nu = i;
    	for(quiz_question q : qq){
    		String fråga = q.getQuestion();
    		allaFrågor.add(fråga);
    	}
    	i++;
    	return allaFrågor.get(nu);
    }
    
}

