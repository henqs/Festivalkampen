package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class quiz_question_choice extends Model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1406882703816801365L;

	@Id
	public
	int choice_id;
	
	public int question_id;
	
	public byte is_right_choice;
	
	public String choice;
	
	public static Finder<Integer, quiz_question_choice> finder = new Finder<Integer,quiz_question_choice>(
		    Integer.class, quiz_question_choice.class
		  );
}
