package internal;

import java.util.Scanner;

public class Prompt {
  private String title;
  private String[] options;
  private Scanner scanner;

  public Prompt(Scanner sc, String title, String[] options) {
    this.scanner = sc;
    this.title = title;
    this.options = options;
  }

  public static void prompt(Scanner sc, String title, String[] options) {
    while (true) {
      System.out.println("=============Customer Management=============");
      System.out.println("| 0: 돌아가기 | 1: 회원가입 | 2: 회원목록 | 3: 로그인 |");
      System.out.println("선택 >> ");

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
