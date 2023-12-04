package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
import java.sql.Date;

@Entity
public class Credit extends Payment {
  public String name;
  public String type;
  public Date expDate;
}
