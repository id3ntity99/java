package service;

import java.sql.SQLException;
import java.util.List;
import dao.OrderDAO;
import entity.Customer;
import entity.Order;

public class OrderService {
  private static final OrderService INSTANCE = new OrderService();

  public static OrderService getInstance() {
    return INSTANCE;
  }

  private OrderService() {
    // Empty constructor
  }

  private OrderDAO dao = OrderDAO.getInstance();

  public void makeOrder(Order order) throws SQLException {
    dao.insertOrder(order);
  }

  public List<Order> showOrders() throws SQLException {
    return dao.selectOrders();
  }

  public Order showMyOrder(Customer loggedInCustomer) throws SQLException {
    return dao.selectOrder(loggedInCustomer);
  }
}
