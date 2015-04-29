package models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class quiz_user_answer extends Model{
	
	@Id
	int user_id;
	
	int question_id;
	
	int choice_id;
	
	boolean is_right;
	
	Date answer_time;
	
}
