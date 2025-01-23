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
public class UpdateTest {
  private static final Logger LOGGER = Logger.getLogger(JDBCTest.class.getName());
  private static final String HOST = "jdbc:mysql://127.0.0.1:3306/user";
  private static final String USER = "root";
  private static final String PASSWORD = "1234";

  public static void main(String[] args) {
    // 1. Connect to DB
    try (Connection conn = DriverManager.getConnection(HOST, USER, PASSWORD);
        Statement statement = conn.createStatement()) { // 2. Create SQL Statement Object
      // 3. Load JDBC Driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // 4. Execute SQL Statements
      String sql =
          "UPDATE `user1` SET `user_name`='김유신', `phone_num`='010-1234-1011' WHERE `uid`='j101'";

      boolean isSuccess = statement.execute(sql);

      if (isSuccess) {
        String msg = String.format("Statement %s executed successfully", sql);
        LOGGER.fine(msg);
      }

      // Connection will be closed because of try-with clause.
    } catch (SQLException | ClassNotFoundException e) {
      String msg = String.format("%s%n%s%n%s%n", e.getMessage(), e.getCause(), e.getStackTrace());
      LOGGER.severe(msg);
    }
  }
}
