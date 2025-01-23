package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PreparedSelectTest {
  private static final Logger LOGGER = Logger.getLogger(PreparedInsertTest.class.getName());
  private static final String HOST = "jdbc:mysql://localhost:3306/user";
  private static final String USER = "root";
  private static final String PASSWORD = "1234";

  public static void main(String[] args) {
    String sql = "SELECT * FROM `user1`";

    try (Connection conn = DriverManager.getConnection(HOST, USER, PASSWORD);
        PreparedStatement statement = conn.prepareStatement(sql)) {

      Class.forName("com.mysql.cj.jdbc.Driver");

      ResultSet set = statement.executeQuery();
      List<User> users = new ArrayList<>();

      while (set.next()) {
        String uid = set.getString(1);
        String name = set.getString(2);
        String phoneNum = set.getString(3);
        int age = set.getInt(4);
        User user = new User(uid, name, phoneNum, age);
        users.add(user);
      }

      for (User user : users) {
        System.out.println(user);
      }


    } catch (SQLException e) {
      String msg = String.format("%s%n%d%n", e.getMessage(), e.getErrorCode());
      LOGGER.severe(msg);
    } catch (ClassNotFoundException e) {
      LOGGER.severe(e.getMessage());
    }
  }
}
