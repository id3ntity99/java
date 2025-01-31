package controller;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import entity.Customer;
import service.CustomerService;

public class CustomerController {
  private static final Logger LOGGER = Logger.getLogger(CustomerController.class.getName());
  private CustomerService customerService = CustomerService.getInstnace();

  public CustomerController() {
    // Empty constructor
  }

  public Customer inputCustomer(Scanner sc) {
    sc.nextLine();

    System.out.print("아이디: ");
    String custId = sc.nextLine();

    System.out.print("이름: ");
    String name = sc.nextLine();

    System.out.print("휴대전화: ");
    String hp = sc.nextLine();

    System.out.print("주소: ");
    String addr = sc.nextLine();

    return new Customer(custId, name, hp, addr);
  }

  public String inputCustId(Scanner sc) {
    sc.nextLine();

    System.out.print("아이디: ");
    return sc.nextLine();
  }

  private void handleException(Exception e) {
    String msg = String.format("[예외 발생] %s%n[Stack Trace] %s", e.getMessage(),
        Arrays.toString(e.getStackTrace()));
    LOGGER.severe(msg);
  }

  public Customer manage(Scanner sc) { // TODO Refactor this method
    Customer loggedInCustomer = null;
    while (true) {
      System.out.println("=============Customer Management=============");
      if (loggedInCustomer != null) {
        System.out.println("| 0: 돌아가기 | 1: 회원가입 | 2: 로그아웃 | 3: 회원목록 |");
      } else {
        System.out.println("| 0: 돌아가기 | 1: 회원가입 | 2: 로그인 | 3: 회원목록 |");
      }
      System.out.print("선택 >> ");

      int choice = sc.nextInt();

      switch (choice) {
        case 0: {
          return loggedInCustomer;
        }
        case 1: {
          Customer newCustomer = inputCustomer(sc);
          customerService.signUp(newCustomer);
          String msg = String.format("[회원가입 완료]  %s", newCustomer);
          LOGGER.info(msg);
          break;
        }
        case 2: {
          if (loggedInCustomer == null) {
            String custId = inputCustId(sc);
            loggedInCustomer = customerService.login(custId);
            if (loggedInCustomer == null) {
              String msg = String.format("[로그인 실퍠] %s가 존재하지 않음", custId);
              LOGGER.log(Level.WARNING, msg);
            } else {
              String msg = String.format("[로그인 성공] %s", loggedInCustomer);
              LOGGER.info(msg);
            }
          } else {
            String msg = String.format("[로그아웃] %s가 정상적으로 로그아웃 됨", loggedInCustomer);
            LOGGER.info(msg);
            loggedInCustomer = null;
          }
          break;
        }
        case 3: {
          try {
            List<Customer> customers = customerService.showCustomers();
            for (Customer customer : customers) {
              String msg = String.format("고객 ID: %s%n이름: %s%n전화번호: %s%n주소: %s%n가입일:%s%n",
                  customer.getCustId(), customer.getName(), customer.getHp(), customer.getAddr(),
                  customer.getrDate());
              System.out.println(msg);
            }
          } catch (SQLException e) {
            handleException(e);
          }
          break;
        }
        default: {
          break;
        }
      }
    }
  }
}
