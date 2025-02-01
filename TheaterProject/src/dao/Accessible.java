package dao;

import java.sql.SQLException;
import java.util.List;

/**
 * An abstract Data Access Object. Every DAO must extends this class.
 */
public interface Accessible<T> {

  public T select(String key) throws SQLException;

  public T select(int key) throws SQLException;

  public List<T> selectAll() throws SQLException;

  public void insert(T entity) throws SQLException;

  public void update(String key, T entity) throws SQLException;

  public void update(int id, T entity) throws SQLException;

  public void delete(String key) throws SQLException;

  public void delete(int id) throws SQLException;
}
