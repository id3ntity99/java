package controller;

import java.util.Scanner;

public class ProductController {

  public void manage(Scanner sc) {
    while (true) {
      System.out.println("=============Product Management=============");
      System.out.println("| 0: 돌아가기 | 1: 상품등록 | 2: 상품목록 | 3: 상품 검색 |");
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
