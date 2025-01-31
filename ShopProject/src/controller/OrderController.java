package controller;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;
import entity.Customer;
import entity.Order;
import service.OrderService;

public class OrderController {
  private static final Logger LOGGER = Logger.getLogger(OrderController.class.getName());
  private OrderService service = OrderService.getInstance();

  private Order inputOrder(Scanner sc, Customer loggedInCustomer) {
    String orderId = loggedInCustomer.getCustId();

    System.out.print("상품 번호: ");
    int orderProduct = sc.nextInt();

    System.out.print("주문 수량: ");
    int orderCount = sc.nextInt();

    return new Order(orderId, orderProduct, orderCount);
  }

  private void handleException(Exception e) {
    String msg = String.format("[예외 발생] %s%n[Stack Trace] %s", e.getMessage(),
        Arrays.toString(e.getStackTrace()));
    LOGGER.severe(msg);
  }

  public void manage(Scanner sc, Customer loggedInCustomer) {
    while (true) {
      System.out.println("=============Order Management=============");
      System.out.println("| 0: 돌아가기 | 1: 주문 | 2: 주문목록 | 3: 나의 주문 |");
      System.out.print("선택 >> ");

      int choice = sc.nextInt();

      switch (choice) {
        case 0: {
          return;
        }
        case 1: {
          Order order = inputOrder(sc, loggedInCustomer);
          try {
            service.makeOrder(order);
          } catch (SQLException e) {
            handleException(e);
          }
          String msg = String.format("[주문 완료] 주문 %s 완료", order.getOrderProduct());
          LOGGER.info(msg);
          break;
        }
        case 2: {
          try {
            service.showOrders().forEach(Order::showOrder);
          } catch (SQLException e) {
            handleException(e);
          }
          break;
        }
        case 3: {
          try {
            Order order = service.showMyOrder(loggedInCustomer);
            order.showOrder();
          } catch (SQLException e) {
            handleException(e);
          } catch (NullPointerException e) {
            LOGGER.warning("[주문 조회 실패] 로그인이 되어 있지 않음");
            return;
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
