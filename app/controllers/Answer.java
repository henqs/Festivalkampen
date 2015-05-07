package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Answer extends Controller{

    String answer = "";

    public static Result postQuery(String query) {
    System.out.print(query);
    return TODO;
    }    
    
    public static Result getContentOf() {
        return TODO;
    }
    public static Result list() {
    return ok();
    }
}