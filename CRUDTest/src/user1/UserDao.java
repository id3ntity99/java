package user1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO means Data Access Object, which is singleton and accesses to database and does CRUD
 * operations.
 */
public class UserDao {
  private static UserDao instance = new UserDao();
  private static final String HOST = "jdbc:mysql://localhost:3306/user";
  private static final String USER = "root";
  private static final String PASSWORD = "1234";

  private Connection conn = null;
  private Statement stmt = null;
  private PreparedStatement psmt = null;
  private ResultSet result = null;

  private UserDao() {
    // Empty constructor. This is singleton.
  }

  private Connection getConnection() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    return DriverManager.getConnection(HOST, USER, PASSWORD);
  }

  private void closeAll() throws SQLException {
    if (result != null)
      result.close();
    if (stmt != null)
      stmt.close();
    if (psmt != null)
      psmt.close();
    if (conn != null)
      conn.close();
  }

  // Must be locked under multi-threaded environment to prevent race-condition
  public static UserDao getInstance() {
    return instance;
  }

  public void insertUser(User user) {
    try {
      conn = getConnection();
      psmt = conn.prepareStatement(SQLQueries.INSERT_USER1);
      psmt.setString(1, user.getUid());
      psmt.setString(2, user.getName());
      psmt.setString(3, user.getPhoneNum());
      psmt.setInt(4, user.getAge());

      psmt.executeUpdate();
      closeAll();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public User selectUser(String uid) {
    User user = null;
    try {
      conn = getConnection();
      psmt = conn.prepareStatement(SQLQueries.SELECT_USER1);
      psmt.setString(1, uid);

      result = psmt.executeQuery();

      if (result.next()) {
        user = new User();
        user.setUid(result.getString(1));
        user.setName(result.getString(2));
        user.setPhoneNum(result.getString(3));
        user.setAge(result.getInt(4));
      }


    } catch (Exception e) {
      e.printStackTrace();
    }
    return user;
  }

  public List<User> selectUsers() {
    List<User> users = new ArrayList<>();
    try {
      conn = getConnection();
      stmt = conn.createStatement();
      result = stmt.executeQuery(SQLQueries.SELECT_ALL_USER1);

      while (result.next()) {
        User user = new User();
        user.setUid(result.getString(1));
        user.setName(result.getString(2));
        user.setPhoneNum(result.getString(3));
        user.setAge(result.getInt(4));
        users.add(user);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    return users;
  }

  public void updateUser(User user) {
    try {
      conn = getConnection();
      psmt = conn.prepareStatement(SQLQueries.UPDATE_USER1);
      psmt.setString(1, user.getName());
      psmt.setString(2, user.getPhoneNum());
      psmt.setInt(3, user.getAge());
      psmt.setString(4, user.getUid());

      psmt.executeUpdate();
      closeAll();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void deleteUser(String uid) {
    try {
      conn = getConnection();
      psmt = conn.prepareStatement(SQLQueries.DELETE_USER1);
      psmt.setString(1, uid);
      closeAll();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
