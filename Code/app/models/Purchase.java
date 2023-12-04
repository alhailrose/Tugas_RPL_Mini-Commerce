package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Purchase extends Model {
 	
	public Date date;
	public String status;
 	
}