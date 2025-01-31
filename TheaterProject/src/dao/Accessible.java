package dao;

import java.util.List;

/**
 * An abstract Data Access Object. Every DAO must extends this class.
 */
public interface Accessible<T> {

  public T select(String id) throws Exception;

  public T select(int id) throws Exception;

  public List<T> selectAll() throws Exception;

  public void insert(T entity) throws Exception;

  public void update(String id, T entity) throws Exception;

  public void update(int id, T entity) throws Exception;

  public void delete(String id) throws Exception;

  public void delete(int id) throws Exception;
}
