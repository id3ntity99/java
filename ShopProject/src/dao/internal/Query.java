package dao.internal;

public class Query {
  public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` VALUES(?, ?, ? ,?, NOW());";
  public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId` = ?;";
}
