package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
import play.data.validation.*;
 
@Entity
public class Administrator extends Model {
 	
	@Required
	public String name;

	@Email
	@Required
	public String email;
	
	@Required
	public String address;
 	public boolean isAdmin;
}