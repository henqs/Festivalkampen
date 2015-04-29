package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class quiz extends Model {
	
	@Id
	public int id;
	
	public String title;

}
