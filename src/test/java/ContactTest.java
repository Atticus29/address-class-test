import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.Timestamp;
import java.util.regex.*;

public class ContactTest {
  private Contact testContact;

  @Before
  public void setUp(){
    testContact = new Contact("Mark", "Fisher", "mark.aaron.fisher@gmail.com");
  }

  // @Rule
  // public DatabaseRule database = new DatabaseRule();

  @Test
  public void constructor_instantiatesContactCorrectly_true(){
    assertTrue(testContact instanceof Contact);
  }

  @Test
  public void getEmail_works_true(){
    assertTrue("mark.aaron.fisher@gmail.com".equals(testContact.getEmail()));

  }

  @Test
  public void isValidEmail_returnsCorrectResponseWhenisValidEmail_true(){
    String testString1 = "mark.aaron.fisher@gmail.com";
    Contact testContact1 = new Contact("Mark", "Fisher", testString1);
    assertTrue(testContact1.isValidEmail(testString1));
    String testString2 = "mark.aaron.fisher@hotmail.com";
    assertTrue(testContact1.isValidEmail(testString2));
    testContact1 = new Contact("Mark", "Fisher", testString2);
    String testString3 = "mark.aaron.fisher@true.com";
    assertTrue(testContact1.isValidEmail(testString3));
    testContact1 = new Contact("Mark", "Fisher", testString3);
    String testString4 = "@mark.aaron.gmail.com";
    assertFalse(testContact1.isValidEmail(testString4));
    testContact1 = new Contact("Mark", "Fisher", testString4);
    String testString5 = "mark.aaron.gmail.com";
    assertFalse(testContact1.isValidEmail(testString5));
  }

  // @Test
  // public void isValidWorksForContact_true(){
  //   assertFalse(testContact.isValid())
  // }

}
