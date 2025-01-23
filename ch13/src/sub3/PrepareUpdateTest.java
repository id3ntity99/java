package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareUpdateTest {
  private static final String HOST = "jdbc:mysql://localhost:3306/user";
  private static final String USER = "root";
  private static final String PASSWORD = "1234";

  public static void main(String[] args) {
    final String sql = "UPDATE `user1` SET `user_name`=?, `phone_num`=?, `age`=? WHERE `uid`=?";

    try (Connection conn = DriverManager.getConnection(HOST, USER, PASSWORD);
        PreparedStatement pstmt = conn.prepareStatement(sql)) {

      Class.forName("com.mysql.cj.jdbc.Driver");

      pstmt.setString(1, "김철수");

    } catch (SQLException e) {
      // TODO: handle exception
    } catch (ClassNotFoundException e) {
      // TODO: handle exception
    }
  }
}
