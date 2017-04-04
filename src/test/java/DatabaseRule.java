import org.junit.rules.ExternalResource;
import org.sql2o.*;

public class DatabaseRule extends ExternalResource {

  @Override
  protected void before() {
    DB.sql2o = new Sql2o("jbdc:postgresql://localhost:5432/address_test_test", null, null);
  }

  @Override
  protected void after() {
    try(Connection con = DB.sql2o.open()) {
      String deleteAddressQuery = "DELETE FROM addresss *;";
      con.createQuery(deleteAddressQuery).executeUpdate();
    }
  }
}
