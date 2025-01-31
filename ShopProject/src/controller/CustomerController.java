package controller;

import java.util.Scanner;

public class CustomerController {
  public CustomerController() {
    // Empty constructor
  }

  public void manage(Scanner sc) {
    while (true) {
      System.out.println("=============Customer Management=============");
      System.out.println("| 0: 돌아가기 | 1: 회원가입 | 2: 회원목록 | 3: 로그인 |");
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
