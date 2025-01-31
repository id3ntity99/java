package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entity.Movie;

public class MoviesDAO implements Accessible<Movie> {

  @Override
  public Movie select(String id) throws SQLException {
    Movie movie = new Movie();
    try (Connection conn = ConnectionUtil.getConnection();
        PreparedStatement psmt = conn.prepareStatement(Query.SELECT_MOVIE);) {
      psmt.setString(1, id);
      ResultSet result = psmt.executeQuery();
      if (result.next()) {
        movie.setMovieId(result.getInt(1));
        movie.setTitle(result.getString(2));
        movie.setGenre(result.getString(3));
        movie.setReleaseDate(result.getString(4));
      }
    } catch (SQLException e) {
      throw new SQLException(e);
    }
    return movie;
  }

  @Override
  public Movie select(int id) throws SQLException {
    return this.select(Integer.toString(id));
  }

  @Override
  public List<Movie> selectAll() throws SQLException {
    List<Movie> movies = new ArrayList<>();
    try (Connection conn = ConnectionUtil.getConnection();
        PreparedStatement psmt = conn.prepareStatement(Query.SELECT_MOVIES);
        ResultSet result = psmt.executeQuery();) {
      while (result.next()) {
        int movieId = result.getInt(1);
        String title = result.getString(2);
        String genre = result.getString(3);
        String releaseDate = result.getString(4);
        Movie movie = new Movie(movieId, title, genre, releaseDate);
        movies.add(movie);
      }
    } catch (SQLException e) {
      throw new SQLException(e);
    }
    return movies;
  }

  @Override
  public void insert(Movie entity) throws SQLException {
    try (Connection conn = ConnectionUtil.getConnection();
        PreparedStatement psmt = conn.prepareStatement(Query.INSERT_MOVIE)) {
      psmt.setInt(1, entity.getMovieId());
      psmt.setString(2, entity.getTitle());
      psmt.setString(3, entity.getGenre());
      psmt.setString(4, entity.getReleaseDate());
      psmt.executeUpdate();
    } catch (SQLException e) {
      throw new SQLException(e);
    }
  }

  @Override
  public void update(String id, Movie entity) throws SQLException {
    try (Connection conn = ConnectionUtil.getConnection();
        PreparedStatement psmt = conn.prepareStatement(Query.UPDATE_MOVIE)) {
      psmt.setInt(1, entity.getMovieId());
      psmt.setString(2, entity.getTitle());
      psmt.setString(3, entity.getGenre());
      psmt.setString(4, entity.getReleaseDate());
      psmt.executeUpdate();
    } catch (SQLException e) {
      throw new SQLException(e);
    }
  }

  @Override
  public void update(int id, Movie entity) throws SQLException {
    this.update(Integer.toString(id), entity);
  }

  @Override
  public void delete(String id) throws SQLException {
    try (Connection conn = ConnectionUtil.getConnection();
        PreparedStatement psmt = conn.prepareStatement(Query.DELETE_MOVIE)) {
      psmt.setString(1, id);
      psmt.executeQuery();
    } catch (SQLException e) {
      throw new SQLException(e);
    }
  }

  @Override
  public void delete(int id) throws SQLException {
    this.delete(Integer.toString(id));
  }
}
