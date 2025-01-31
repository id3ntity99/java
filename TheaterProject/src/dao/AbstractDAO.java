package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 * An abstract Data Access Object. Every DAO must extends this class.
 */
public abstract class AbstractDAO<T> {
  private static final String HOST;
  private static final String USER;
  private static final String PASS;

  static {// TODO: Currently working position;
          // Should I separate this static block and getConnection() method into an Utility class?
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

  protected Connection getConnection() throws SQLException {
    return DriverManager.getConnection(HOST, USER, PASS);
  }

  public abstract T select(String id);

  public abstract T select(int id);

  public abstract List<T> selectAll();

  public abstract void insert(T entity);

  public abstract void update(String id, T entity);

  public abstract void update(int id, T entity);

  public abstract void delete(String id);

  public abstract void delete(int id);
}
