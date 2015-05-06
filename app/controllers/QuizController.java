package controllers;

import play.api.libs.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import play.*;
import play.mvc.BodyParser;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;



public class QuizController extends Controller{

 //   @BodyParser.Of(BodyParser.Json.class)
 //   public Result sayHello() {
 //   JsonNode json = request().body().asJson();
//}

    public Result sayGoodbye() {
    JsonNode json = request().body().asJson();
    if(json == null) {
        return badRequest("Expecting Json data");
    } else {
        String name = json.findPath("name").textValue();
        if(name == null) {
            return badRequest("Missing parameter [name]");
        } else {
            return ok("Hello " + name);
        }
    }
}

    public static Result sayHello(String data) {

    Question question = Question.showAnswer(data);
    return ok(index.html.Question.show(question);
}

    @BodyParser.Of(BodyParser.Json.class)
    public static Result test() {
        JsonNode json = request().body().asJson();
        String name = json.findPath("answer").textValue();
        return ok(index.render(name));
    }
    public static Result getJson(String data) {
        JsonNode json = request().body().asJson();
        if(json == null)
            return badRequest("Förväntade sig JSON-objekt");
        else{
            String name = json.findPath("name").textValue();
            if(name == null)
                return ok("gick in i name==null, saknar parametrar");
            else
                return ok("hello " +name);
        }
     //   String pageName = str.getJSONObject("JSONObject").getString("answer");
     //   return ok();
    }
    public static Result getAnswer() {
    
    return TODO;
    }    
    
    public static Result testGet() {
    return TODO;
    }
}
