package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import sub1.JDBCTest;

/*-
 * 날짜: 2025/01/23
 * 이름: 이현민
 * 내용: Java JDBC CRUD operations
 */
public class SelectTest {
  private static final Logger LOGGER = Logger.getLogger(JDBCTest.class.getName());
  private static final String HOST = "jdbc:mysql://127.0.0.1:3306/user";
  private static final String USER = "root";
  private static final String PASSWORD = "1234";

  public static void main(String[] args) {
    // 1. Connect to DB
    try (Connection conn = DriverManager.getConnection(HOST, USER, PASSWORD);
        Statement statement = conn.createStatement()) {// 2. Create SQL Statement Object

      // 3. Load JDBC Driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // 4. Execute SQL Statements
      String sql = "SELECT * FROM `user1`";
      ResultSet res = statement.executeQuery(sql);

      List<User> users = new ArrayList<>();
      /*
       * 5. Process ResultSet. Result set has a cursor that points the very first row of table at
       * the beginning. Move cursor to iterate the result of SELECT statement. Calling a next()
       * string will move cursor to the next row and then return if there is a next row.
       * getString(int index) will retrieve the value of the column of current row. Note that, the
       * index argument used by getString starts with 1, not 0.
       * 
       */
      while (res.next()) {
        String uid = res.getString(1);
        String name = res.getString(2);
        String phoneNum = res.getString(3);
        int age = res.getInt(4);
        User user = new User(uid, name, phoneNum, age);
        users.add(user);
      }

      // Iterate list to checkout data retrieved from DB.
      for (User user : users) {
        System.out.println(user);
      }
      res.close();// connection and statement will be close automatically because of try-with clause
    } catch (ClassNotFoundException e) {
      LOGGER.severe(e.getMessage());
    } catch (SQLException e) {
      String msg = String.format("%s%n%d%n", e.getMessage(), e.getErrorCode());
      LOGGER.severe(msg);
    }
  }
}
