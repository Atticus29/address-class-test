import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Email {
  String email;

  public Email(String emailAddress) {
    this.email = emailAddress;
  }

  public boolean isValid(){
    Pattern p = Pattern.compile("\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}\b");
    return Pattern.matches(p, this.email);
  }

}
