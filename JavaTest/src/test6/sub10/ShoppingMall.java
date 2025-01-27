package test6.sub10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShoppingMall {
  private List<Customer> customers;
  private List<Order> orders;
  private HashMap<String, List<Order>> customerOrders;

  public ShoppingMall() {
    this.customers = new ArrayList<>();
    this.orders = new ArrayList<>();
    this.customerOrders = new HashMap<>();
  }

  public void addCustomer(Customer customer) {
    String custName = customer.getName();
    if (!customerOrders.containsKey(custName)) {
      customerOrders.put(custName, new ArrayList<>());
    }
    customers.add(customer);
  }

  public void addOrder(Order order) {
    String custName = order.getCustomer().getName();
    if (!customerOrders.containsKey(custName)) {
      this.addCustomer(order.getCustomer());
    }
    List<Order> ordersList = customerOrders.get(custName);
    ordersList.add(order);
    orders.add(order);
  }

  public List<Order> getOrders() {
    return orders;
  }
}
