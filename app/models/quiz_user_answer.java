package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class quiz_user_answer extends Model{
	
	@Id
	public int user_id;
	
	public int question_id;
	
	public int choice_id;
	
	public boolean is_right;
	
	public Date answer_time;
	
}
