package models;
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity

public class Shipping extends Model {

  public String shipMethod;

  public String toString() {
    return  shipMethod;
}
}
