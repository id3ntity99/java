package user2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UserDAO {
  /**
   * This class employs the singleton pattern.
   */
  private static UserDAO instance = new UserDAO();

  /**
   * Use Java Properties for this practice. <br>
   * The props contains information for DB connection.
   */
  private static Properties props;

  static {// Static initialize static fields TODO: Inject Properties from AppMain?
    props = new Properties();
    String sep = File.separator;
    String propsPath =
        System.getProperty("user.dir") + sep + "resources" + sep + "application.properties";
    try {
      InputStream in = new FileInputStream(propsPath);
      props.load(in);
      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static UserDAO getInstance() {
    return instance;
  }

  private UserDAO() {
    // Empty constructor
  }

  private Connection getConnection() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    String host = props.getProperty("db.host");
    String user = props.getProperty("db.user");
    String pw = props.getProperty("db.password");

    return DriverManager.getConnection(host, user, pw);
  }

  private User process(ResultSet result) throws SQLException {
    User user = new User();
    if (result == null)
      return user;
    user.setUid(result.getString(1));
    user.setName(result.getString(2));
    user.setPhoneNum(result.getString(3));
    user.setAge(result.getInt(4));
    return user;
  }

  public List<User> selectAll() {
    List<User> users = new ArrayList<>();
    try (Connection conn = getConnection();
        PreparedStatement psmt = conn.prepareStatement(SQLQueries.SELECT_ALL_USER2)) {
      ResultSet result = psmt.executeQuery();
      while (result.next()) {
        User user = process(result);
        users.add(user);
      }
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    return users;
  }

  public User select(String uid) {
    User user = new User();
    try (Connection conn = getConnection();
        PreparedStatement psmt = conn.prepareStatement(SQLQueries.SELECT_USER2)) {
      psmt.setString(1, uid);
      ResultSet result = psmt.executeQuery();
      if (result.next())
        user = process(result);
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    return user;
  }
}
