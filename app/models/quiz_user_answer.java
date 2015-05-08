package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class quiz_user_answer extends Model{
	
	@Id
	public long user_id;
	
	public int question_id;
	@Id
	public int choice_id;
	
	public byte is_right;
	
	public Date answer_time;
	
}
