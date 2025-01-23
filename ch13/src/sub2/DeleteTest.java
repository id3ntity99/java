package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import sub1.JDBCTest;

/*-
 * 날짜: 2025/01/23
 * 이름: 이현민
 * 내용: Java JDBC CRUD operations
 */
public class DeleteTest {
  private static final Logger LOGGER = Logger.getLogger(JDBCTest.class.getName());
  private static final String HOST = "jdbc:mysql://127.0.0.1:3306/user";
  private static final String USER = "root";
  private static final String PASSWORD = "1234";

  public static void main(String[] args) {
    try (Connection conn = DriverManager.getConnection(HOST, USER, PASSWORD);
        Statement statement = conn.createStatement()) {
      Class.forName("com.mysql.cj.jdbc.Driver");

      String sql = "DELETE FROM `user1` WHERE `uid`='j101'";
      boolean isSuccess = statement.execute(sql);

      if (isSuccess) {
        String msg = String.format("Statement %s executed successfully", sql);
        LOGGER.fine(msg);
      }

    } catch (ClassNotFoundException e) {
      LOGGER.severe(e.getMessage());
    } catch (SQLException e) {
      String msg = String.format("%s%nError Code: %d%n", e.getMessage(), e.getErrorCode());
      LOGGER.severe(msg);
    }
  }
}
