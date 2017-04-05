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

public class EmailTest {

  // @Rule
  // public DatabaseRule databse = new DatabaseRule();

  @Test
  public void isValid_returnsWhenEmailAddressIsValid_true(){
    Email testEmail1 = new Email ("mark.aaron.fisher@gmail.com");
    assertTrue(testEmail1.isValid());
    Email testEmail2 = new Email ("mark.aaron.fisher@hotmail.com");
    assertTrue(testEmail2.isValid());
    Email testEmail3 = new Email ("mark.aaron.fisher@true.com");
    assertTrue(testEmail3.isValid());
    Email testEmail4 = new Email ("@mark.aaron.gmail.com");
    assertFalse(testEmail4.isValid());
    Email testEmail5 = new Email ("mark.aaron.gmail.com");
    assertFalse(testEmail5.isValid());
  }
}
