package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
import play.data.validation.*;
 
@Entity
public class Item extends Model {
 	
	@Required
	public String merkLaptop;

	@Required
	public String storage;

	@Required
	public String itemPrice;

	public String toString() {
    return  merkLaptop + "|" +storage + "|Rp." + itemPrice;
}
 	
}
