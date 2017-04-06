import java.util.regex.*;

public abstract class Email {
  public String email;

  // public Email(String emailAddress) {
  //   this.email = emailAddress;
  // }

  public boolean isValid(){
    String p = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    System.out.println("p is " + p);
    return Pattern.matches(p, this.email);
  }

  public boolean isValidEmail(String emailAddress){
    String p = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    return Pattern.matches(p, emailAddress);
  }
}
