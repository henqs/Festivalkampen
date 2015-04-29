package models;


import javax.persistence.*;

import play.db.ebean.Model;

@Entity
public class quiz_question extends Model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6495045923835585919L;

	@Id
	public int question_id;
	
	public String question;
	
	public enum is_active{
		
	};
	
	public String getQuestion(){
		return question;
	}
	
	public static Finder<Integer,quiz_question> find = new Finder<Integer,quiz_question>(
		    Integer.class, quiz_question.class
		  );

	

	
}
