package controller;

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

  public void manage(Scanner sc) { // TODO Refactor this method
    Customer logedInCustomer = null;
    while (true) {
      System.out.println("=============Customer Management=============");
      if (logedInCustomer != null) {
        System.out.println("| 0: 돌아가기 | 1: 회원가입 | 2: 로그아웃 | 3: 회원목록 |");
      } else {
        System.out.println("| 0: 돌아가기 | 1: 회원가입 | 2: 로그인 | 3: 회원목록 |");
      }
      System.out.print("선택 >> ");

      int choice = sc.nextInt();

      switch (choice) {
        case 0: {
          return;
        }
        case 1: {
          Customer newCustomer = inputCustomer(sc);
          customerService.signUp(newCustomer);
          String msg = String.format("[회원가입 완료]  %s", newCustomer);
          LOGGER.info(msg);
          break;
        }
        case 2: {
          if (logedInCustomer == null) {
            String custId = inputCustId(sc);
            logedInCustomer = customerService.login(custId);
            if (logedInCustomer == null) {
              String msg = String.format("[로그인 실퍠] %s가 존재하지 않음", custId);
              LOGGER.log(Level.WARNING, msg);
            } else {
              String msg = String.format("[로그인 성공] %s", logedInCustomer);
              LOGGER.info(msg);
            }
          } else {
            String msg = String.format("[로그아웃] %s가 정상적으로 로그아웃 됨", logedInCustomer);
            LOGGER.info(msg);
            logedInCustomer = null;
          }
          break;
        }
        case 3: {
          break;
        }
        default: {
          break;
        }
      }
    }
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
}
