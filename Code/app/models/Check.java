package models;
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Check extends Payment {
  public String name;
  public String bankID;
}
