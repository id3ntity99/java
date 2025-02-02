package service;

import java.sql.SQLException;
import java.util.List;
import dao.Accessible;
import dao.MoviesDAO;
import entity.Movie;

public class MoviesService {
  private static final MoviesService INSTANCE = new MoviesService();

  public static MoviesService getInstance() {
    return INSTANCE;
  }

  private Accessible<Movie> dao = MoviesDAO.getInstance();

  private MoviesService() {
    // Empty constructor
  }

  public Movie search(String name) throws SQLException {
    return dao.select(name);
  }

  public List<Movie> getMovies() throws SQLException {
    return dao.selectAll();
  }

  public void enroll(Movie movie) throws SQLException {
    dao.insert(movie);
  }

  public void modify(String id, Movie movie) throws SQLException {
    dao.update(id, movie);
  }

  public void delete(String id) throws SQLException {
    dao.delete(id);
  }
}
