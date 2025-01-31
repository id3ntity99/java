package dao;

import java.util.List;

/**
 * An abstract Data Access Object. Every DAO must extends this class.
 */
public interface Accessible<T> {

  public T select(String id);

  public T select(int id);

  public List<T> selectAll();

  public void insert(T entity);

  public void update(String id, T entity);

  public void update(int id, T entity);

  public void delete(String id);

  public void delete(int id);
}
