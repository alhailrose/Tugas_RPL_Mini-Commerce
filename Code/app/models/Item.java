package models;
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Item extends Model {
  public String item_name;
  public String description;
  
}
