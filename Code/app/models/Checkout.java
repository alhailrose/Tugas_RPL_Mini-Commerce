package models;
import play.*;
import play.db.jpa.*;

import javax.jws.soap.SOAPBinding.Use;
import javax.persistence.*;
import java.util.*;
import play.data.validation.*;
 
@Entity
public class Checkout extends Model {
  @Required
  @ManyToOne
  public User custName;
  
  @Required
  @ManyToOne
  public Item merkName;

  @Required
  @ManyToOne
  public Price priceItem;

  @Required
  @ManyToOne
  public Shipping shipItem;

  @Required
  @ManyToOne
  public Payment payMethod;

  @Lob
  @Required
  @MaxSize(10000)
  public String description;

  
  
}
