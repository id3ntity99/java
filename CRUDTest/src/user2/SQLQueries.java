package user2;

public final class SQLQueries {
  public static final String INSERT_USER2 = "INSERT INTO `User2` VALUES(?,?,?,?);";
  public static final String UPDATE_USER2 =
      "UPDATE `User2` SET `name`=?, `hp`=?, `age`=? WHERE `uid`=?;";
  public static final String DELETE_USER2 = "DELETE FROM `User2` WHERE `uid`=?;";
  public static final String SELECT_ALL_USER2 = "SELECT * FROM `User2`;";
  public static final String SELECT_USER2 = "SELECT * FROM `User2` WHERE `uid`=?";

  private SQLQueries() {
    // This class only contains constants.
  }
}
