package models;
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
import play.data.validation.*;
 
@Entity
public class Item extends Model {
  public String item_name;

  @Lob
  @Required
  @MaxSize(10000)
  public String description;

  @Required
  @ManyToOne
  public Customer author;
  
}
