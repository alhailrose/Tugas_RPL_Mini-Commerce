package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
import play.data.validation.*;
 
@Entity
public class Payment extends Model {
  public String paymentMethod;

  public String toString() {
    return  paymentMethod;
}
}
