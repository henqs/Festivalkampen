package models;

import javax.persistence.*;

import play.db.ebean.*;


public class User extends Model{
	
    @Id 
    public int id;

    // Queries
	public User(int id){
		this.id = id;
	}
	

}

