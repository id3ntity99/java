package service;

import java.sql.SQLException;
import java.util.List;
import dao.CustomerDAO;
import entity.Customer;

public class CustomerService {
  private static final CustomerService INSTANCE = new CustomerService();

  public static CustomerService getInstnace() {
    return INSTANCE;
  }

  private CustomerDAO dao = CustomerDAO.getInstance();

  private CustomerService() {
    // Empty constructor
  }

  // TODO Make this method return boolean value that tells successful-ness or throw exception
  public void signUp(Customer customer) {
    dao.insertCustomer(customer);
  }

  public Customer login(String custId) {
    return dao.selectCustomer(custId);
  }

  public void removeCustomer(String custId) {
    dao.deleteCustomer(custId);
  }

  public void modifyCustomer(Customer customer) {
    dao.updateCustomer(customer);
  }

  public List<Customer> showCustomers() throws SQLException {
    return dao.selectCustomers();
  }
}
