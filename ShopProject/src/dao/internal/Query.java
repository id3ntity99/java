package dao.internal;

public class Query {
  public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` VALUES(?, ?, ? ,?, NOW());";
  public static final String INSERT_PRODUCT = "INSERT INTO `Product` VALUES(?, ?, ?, ?, ?);";
  public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId` = ?;";
  public static final String SELECT_PRODUCTS = "SELECT * FROM `Product`;";
  public static final String SELECT_PRODUCT = "SELECT * FROM `Product` WHERE `prodNo` = ?;";
}
