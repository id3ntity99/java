package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public class PrepareUpdateTest {
  private static final Logger LOGGER = Logger.getLogger(PrepareUpdateTest.class.getName());
  private static final String HOST = "jdbc:mysql://localhost:3306/user";
  private static final String USER = "root";
  private static final String PASSWORD = "1234";

  public static void main(String[] args) {
    final String sql = "UPDATE `user1` SET `user_name`=?, `phone_num`=?, `age`=? WHERE `uid`=?";

    try (Connection conn = DriverManager.getConnection(HOST, USER, PASSWORD);
        PreparedStatement pstmt = conn.prepareStatement(sql)) {

      Class.forName("com.mysql.cj.jdbc.Driver");

      pstmt.setString(1, "김철수");
      pstmt.setString(2, "010-9999-0000");
      pstmt.setInt(3, 30);
      pstmt.setString(4, "J101");

      pstmt.executeUpdate();

    } catch (SQLException e) {
      String msg = String.format("%s%n%d%n", e.getMessage(), e.getErrorCode());
      LOGGER.severe(msg);
    } catch (ClassNotFoundException e) {
      LOGGER.severe(e.getMessage());
    }
  }
}
