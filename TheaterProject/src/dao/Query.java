package dao;

public final class Query {
  public static final String SELECT_MOVIE = "SELECT * FROM `movies` WHERE `movie_id` = ?;";
  public static final String SELECT_MOVIES = "SELECT * FROM `movies`;";

  public static final String INSERT_MOVIE = "INSERT INTO `movies` VALUES (?, ?, ?, NOW());";

  public static final String UPDATE_MOVIE =
      "UPDATE `movies` SET `movie_id`=?, `title`=?, `genre`=?, `release_date`=?;";

  public static final String DELETE_MOVIE = "DELETE FROM `movies` WHERE `movie_id`=?;";

  private Query() {
    // Empty constructor. Use public constants.
  }
}
