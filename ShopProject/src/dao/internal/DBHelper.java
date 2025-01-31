package dao.internal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
  private static final String HOST = "jdbc:mysql://localhost:3306/shop";
  private static final String USER = "shop";
  private static final String PASS = "1234";

  static {// JVM will load jdbc.Driver class when DBHelper class is loaded.
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  protected Connection conn = null;
  protected PreparedStatement psmt = null;
  protected Statement stmt = null;
  protected ResultSet result = null;

  /**
   * Using protected specifier because this method is useless to the end user except DAO classes.
   * 
   * @return
   * @throws SQLException
   */
  protected Connection getConnection() throws SQLException {
    return DriverManager.getConnection(HOST, USER, PASS);
  }

  /**
   * Using protected specifier because this method is useless to the end user except DAO classes.
   * 
   * @throws SQLException
   */
  protected void close() throws SQLException {
    if (result != null)
      result.close();

    if (stmt != null)
      stmt.close();

    if (psmt != null)
      psmt.close();

    if (conn != null)
      conn.close();
  }
}
