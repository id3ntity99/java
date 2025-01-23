package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

/*-
 * 날짜: 2025/01/23
 * 이름: 이현민
 * 내용: Java JDBC CRUD operations
 */
public class PreparedInsertTest {
  private static final Logger LOGGER = Logger.getLogger(PreparedInsertTest.class.getName());
  private static final String HOST = "jdbc:mysql://localhost:3306/user";
  private static final String USER = "root";
  private static final String PASSWORD = "1234";

  public static void main(String[] args) {
    try (Connection conn = DriverManager.getConnection(HOST, USER, PASSWORD)) {
      Class.forName("com.mysql.cj.jdbc.Driver");

      String sql = "INSERT INTO `user1` VALUES (?,?,?,?)";
      PreparedStatement stmt = conn.prepareStatement(sql);

      // Mapping query parameters(the question marks in sql string"
      stmt.setString(1, "J101");
      stmt.setString(2, "홍길동");
      stmt.setString(3, "010-1111-2222");
      stmt.setInt(4, 23);

      stmt.executeUpdate();

      stmt.close();

    } catch (SQLException e) {
      String msg = String.format("%s%n%d%n", e.getMessage(), e.getErrorCode());
      LOGGER.severe(msg);
    } catch (ClassNotFoundException e) {
      LOGGER.severe(e.getMessage());
    }
  }
}
