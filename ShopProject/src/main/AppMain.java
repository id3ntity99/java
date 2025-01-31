package main;

import java.util.Scanner;
import controller.CustomerController;
import controller.OrderController;
import controller.ProductController;

public class AppMain {
  public static void main(String[] args) {
    CustomerController customerController = new CustomerController();
    OrderController orderController = new OrderController();
    ProductController productController = new ProductController();
    Scanner sc = new Scanner(System.in);

    boolean isRunning = true;

    while (isRunning) {
      System.out.println("=============Shop Project=============");
      System.out.println("| 0: 종료 | 1: 회원관리 | 2: 상품관리 | 3: 주문관리 |");
      System.out.print("선택 >> ");

      int answer = sc.nextInt();

      switch (answer) {
        case 0: {
          isRunning = false;
          break;
        }
        case 1: {
          customerController.manage(sc);
          break;
        }
        case 2: {
          productController.manage(sc);
          break;
        }
        case 3: {
          orderController.manage(sc);
          break;
        }
        default: {
          System.out.println("다시 선택하세요");
          break;
        }
      }
    }
    sc.close();
    System.out.println("프로그램 종료.....");
  }
}
