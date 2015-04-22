package models;

import javax.persistence.*;
import javax.validation.*;
import play.api.data.validation.*;
import play.data.*;

public class User {
	
	public String namn;
	public int ålder;

	
	public User(String namn, int ålder){
		this.namn = namn;
		this.ålder = ålder;
	}

}