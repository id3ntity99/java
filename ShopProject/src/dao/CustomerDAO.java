package dao;

import java.util.ArrayList;
import java.util.List;
import dao.internal.DBHelper;
import dao.internal.Query;
import entity.Customer;

public class CustomerDAO extends DBHelper {
  private static final CustomerDAO INSTANCE = new CustomerDAO();

  public static CustomerDAO getInstance() {
    return INSTANCE;
  }

  private CustomerDAO() {
    // Empty constructor
  }

  public void insertCustomer(Customer customer) {
    try {
      this.conn = getConnection();
      this.psmt = conn.prepareStatement(Query.INSERT_CUSTOMER);

      this.psmt.setString(1, customer.getCustId());
      this.psmt.setString(2, customer.getName());
      this.psmt.setString(3, customer.getHp());
      this.psmt.setString(4, customer.getAddr());
      this.psmt.executeUpdate();

      close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public Customer selectCustomer(String custId) {
    Customer customer = null;
    try {
      this.conn = getConnection();
      this.psmt = conn.prepareStatement(Query.SELECT_CUSTOMER);

      this.psmt.setString(1, custId);
      this.result = psmt.executeQuery();

      if (this.result.next()) {
        String id = result.getString(1);
        String name = result.getString(2);
        String ph = result.getString(3);
        String addr = result.getString(4);
        String rDate = result.getString(5);
        customer = new Customer(id, name, ph, addr, rDate);
      }

      close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return customer;
  }

  public List<Customer> selectCustomers() {
    List<Customer> customers = new ArrayList<>();
    return customers;
  }

  public void updateCustomer(Customer customer) {

  }

  public void deleteCustomer(String custId) {

  }
}
