package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.internal.DBHelper;
import dao.internal.Query;
import entity.Customer;
import entity.Order;

public class OrderDAO extends DBHelper {
  private static final OrderDAO INSTANCE = new OrderDAO();

  public static OrderDAO getInstance() {
    return INSTANCE;
  }

  private OrderDAO() {
    // Empty Constructor
  }

  public void insertOrder(Order order) throws SQLException {
    this.conn = this.getConnection();
    this.psmt = conn.prepareStatement(Query.INSERT_ORDER);
    psmt.setInt(1, order.getOrderNo());
    psmt.setString(2, order.getOrderId());
    psmt.setInt(3, order.getOrderProduct());
    psmt.setInt(4, order.getOrderCount());

    psmt.executeUpdate();

    this.close();
  }

  public Order selectOrder(Customer customer) throws SQLException {
    Order order = new Order();
    this.conn = this.getConnection();
    this.psmt = conn.prepareStatement(Query.SELECT_ORDER);

    psmt.setString(1, customer.getCustId());
    this.result = psmt.executeQuery();

    if (result.next()) {
      order.setOrderNo(result.getInt(1));
      order.setOrderId(result.getString(2));
      order.setOrderProduct(result.getInt(3));
      order.setOrderCount(result.getInt(4));
      order.setOrderDate(result.getString(5));
    }

    this.close();

    return order;
  }

  public List<Order> selectOrders() throws SQLException {
    List<Order> orders = new ArrayList<>();
    this.conn = this.getConnection();
    this.psmt = conn.prepareStatement(Query.SELECT_ORDER_JOIN_PRODUCT);
    this.result = psmt.executeQuery();
    while (result.next()) {
      Order order = new Order();
      order.setOrderNo(result.getInt(1));
      order.setOrderId(result.getString(2));
      order.setProdName(result.getString(3));
      order.setOrderCount(result.getInt(4));
      order.setPrice(result.getInt(5));
      order.setTotal(result.getInt(6));
      order.setOrderDate(result.getString(7));

      orders.add(order);
    }

    this.close();

    return orders;
  }

  public void updateOrder(int orderNo) throws SQLException {

  }

  public void deleteOrder(int orderNo) throws SQLException {

  }
}
