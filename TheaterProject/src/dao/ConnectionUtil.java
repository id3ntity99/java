package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Utility class which is responsible to making connection to database server. All methods of this
 * class are static. The methods were moved from {@link Accessible} to this class, to secure Single
 * Responsibility Principle.
 */
public class ConnectionUtil {
  private static final String HOST;
  private static final String USER;
  private static final String PASS;

  static {
    Properties props = new Properties();
    String sep = File.separator;
    String userDir = System.getProperty("user.dir");
    String propsPath = userDir + sep + "resources" + sep + "application.properties";
    try (InputStream propsIn = new FileInputStream(propsPath)) {
      props.load(propsIn);
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }

    HOST = props.getProperty("db.host");
    USER = props.getProperty("db.user");
    PASS = props.getProperty("db.password");
  }

  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(HOST, USER, PASS);
  }
}
