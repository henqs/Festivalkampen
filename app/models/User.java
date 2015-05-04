package models;

import javax.validation.*;
import play.api.data.validation.*;
import play.data.*;
import javax.persistence.*;

import play.db.ebean.*;


public class User extends Model{
	
	public String namn;
	public char gender;
	
    @Id 
    public int id;

	
    // Queries
	public User(int id){
		this.id = id;
	}

}