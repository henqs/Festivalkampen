package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class quiz_question_choice extends Model{
	
	@Id
	int choice_id;
	
	int question_id;
	
	boolean is_right_choice;
	
	String choice;
}
