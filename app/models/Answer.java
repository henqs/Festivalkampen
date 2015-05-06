package models;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    
    public String str;
    
    public Answer() { }
    
    public Answer(String str) {
        this.str = str;
       
    }

    
    private static List<Answer> answers;
    
    static {
        answers = new ArrayList<Answer>();
        answers.add(new Answer("You answered a question"));
    }
    
    public static List<Answer> findAll() {
        
        return new ArrayList<Answer>(answers);
    }

    
    public String toString() {
    return String.format("You answered a question" +str);
    }
}