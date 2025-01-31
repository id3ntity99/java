package controller;

import java.util.Scanner;

public class OrderController {
  public void manage(Scanner sc) {
    while (true) {
      System.out.println("=============Order Management=============");
      System.out.println("| 0: 돌아가기 | 1: 주문 | 2: 주문목록 | 3: 나의 주문 |");
      System.out.print("선택 >> ");

      int choice = sc.nextInt();

      switch (choice) {
        case 0: {
          break;
        }
        case 1: {
          break;
        }
        case 2: {
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
}
