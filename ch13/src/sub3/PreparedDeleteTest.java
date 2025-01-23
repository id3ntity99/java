package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public class PreparedDeleteTest {
  private static final Logger LOGGER = Logger.getLogger(PreparedInsertTest.class.getName());
  private static final String HOST = "jdbc:mysql://localhost:3306/user";
  private static final String USER = "root";
  private static final String PASSWORD = "1234";

  public static void main(String[] args) {
    String sql = "DELETE FROM `user1` WHERE `uid`=?";

    try (Connection conn = DriverManager.getConnection(HOST, USER, PASSWORD);
        PreparedStatement psmt = conn.prepareStatement(sql)) {
      Class.forName("com.mysql.cj.jdbc.Driver");

      psmt.setString(1, "J101");
      psmt.execute();

    } catch (SQLException e) {
      String msg = String.format("%s%n%d%n", e.getMessage(), e.getErrorCode());
      LOGGER.severe(msg);
    } catch (ClassNotFoundException e) {
      LOGGER.severe(e.getMessage());
    }
  }
}
