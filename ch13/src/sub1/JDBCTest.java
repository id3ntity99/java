package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/*-
 * 날짜: 2025/01/23
 * 이름: 이현민
 * 내용: Java JDBC 접속 테스트
 * 
 * JDBC: Java DataBase Connection. JDBC allows users to connect to users' DB using Java.
 */
public class JDBCTest {
  private static final Logger LOGGER = Logger.getLogger(JDBCTest.class.getName());

  public static void main(String[] args) {
    // DB info
    final String host = "jdbc:mysql://127.0.0.1:3306/sakila";
    final String user = "root";
    final String pw = "1234";

    // Connect to DB
    try (Connection conn = DriverManager.getConnection(host, user, pw)) {

      // Load JDBC Driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      if (conn != null) {
        LOGGER.info("Connection succeed");
      }
    } catch (ClassNotFoundException | SQLException e) {
      String str = String.format("%s%n%s%n%s%n", e.getMessage(), e.getCause(), e.getStackTrace());
      LOGGER.severe(str);
    }
  }
}
