package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
import play.data.validation.*;
 
@Entity
public class Payment extends Model {
  public Integer bank_Id;
  public String bank_name;
  public Float amount;
}
