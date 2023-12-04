package models;
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity

public class Detail extends Model {
  public Integer quantity;
  public String taxStatus;
}
