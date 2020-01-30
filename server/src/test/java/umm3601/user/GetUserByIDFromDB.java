package umm3601.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;


/**
 * Tests umm3601.user.Database getUser functionality
 */
public class GetUserByIDFromDB {

  @Test
  public void getStokesClayton() throws IOException {
    Database db = new Database("src/main/data/users.json");
    User user = db.getUser("588935f52787254123f71fed");
    assertEquals("Stokes Clayton", user.name, "Incorrect name");
  }

  @Test
  public void getBoltonMonroe() throws IOException {
    Database db = new Database("src/main/data/users.json");
    User user = db.getUser("588935f5556f992bf8f37c01");
    assertEquals("Bolton Monroe", user.name, "Incorrect name");
  }
}