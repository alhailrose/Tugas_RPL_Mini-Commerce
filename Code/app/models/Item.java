package models;
import play.*;
import play.db.jpa.*;

import javax.jws.soap.SOAPBinding.Use;
import javax.persistence.*;
import java.util.*;
import play.data.validation.*;
 
@Entity
public class Item extends Model {
  @Required
  @ManyToOne
  public User custName;
  
  public String item_name;

  @Lob
  @Required
  @MaxSize(10000)
  public String description;

  
  
}
