package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
import play.data.validation.*;
 
@Entity
public class Administrator extends Model {
 	
	@Required
	@Email
	public String email;

	@Required
	public String password;

	public Administrator(String email, String password){
		this.email =email;
		this.password=password;
	}

	public static Administrator connect(String email, String password) {
    return find("byEmailAndPassword", email, password).first();
}
}