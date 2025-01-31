package dao.internal;

public class Query {
  public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` VALUES(?, ?, ? ,?, NOW());";
  public static final String INSERT_PRODUCT = "INSERT INTO `Product` VALUES(?, ?, ?, ?, ?);";
  public static final String INSERT_ORDER =
      "INSERT INTO `Order` SET `orderNo`=?, `orderId`=?, `orderProduct`=?, `orderCount`=?, `orderDate`=NOW();";

  public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId` = ?;";
  public static final String SELECT_CUSTOMERS = "SELECT * FROM `Customer`;";
  public static final String SELECT_PRODUCTS = "SELECT * FROM `Product`;";
  public static final String SELECT_PRODUCT = "SELECT * FROM `Product` WHERE `prodNo` = ?;";
  public static final String SELECT_ORDER_JOIN_PRODUCT = "SELECT " + "`orderNo`, " + "`orderId`, "
      + "`prodName`, " + "`orderCount`, " + "`price`, " + "`orderCount` * `price` as `total`, "
      + "`orderDate` " + "from `order` as a join `product` as b on a.orderProduct = b.prodNo;";
  public static final String SELECT_ORDERS = "SELECT * FROM `Order`;";
  public static final String SELECT_ORDER = "SELECT * FROM `Order` WHERE `orderId`=?;";
}
