import org.sql2o.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.Timestamp;

public class Contact extends Email {

  private String firstName;
  private String lastName;

  public Contact(String first, String last, String email) {
    this.firstName = first;
    this.lastName = last;
    this.email = email;
  }

  public String getEmail(){
    return this.email;
  }

}
