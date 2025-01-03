package chap4.pset;

import java.util.Scanner;

public class Banking {
  private static void printCols() {
    System.out.println("-------------------------------");
    System.out.println();
    System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
    System.out.println();
    System.out.println("-------------------------------");
    System.out.println();
  }

  private static int getUserOption(Scanner scanner) {
    System.out.print("선택> ");
    int n = Integer.parseInt(scanner.nextLine());
    return n;
  }

  private static int getUserDeposit(Scanner scanner) {
    System.out.print("예금> ");
    int n = Integer.parseInt(scanner.nextLine());
    System.out.println();
    return n;
  }

  private static int getWithdrawl(Scanner scanner) {
    System.out.print("출금> ");
    int n = Integer.parseInt(scanner.nextLine());
    System.out.println();
    return n;
  }

  private static void printBalance(int balance) {
    System.out.println("잔고> " + balance);
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int opt = 0;
    int balance = 0;

    while (opt != 4) {
      printCols();
      opt = getUserOption(scanner);

      if (opt == 1) {
        int deposit = getUserDeposit(scanner);
        balance += deposit;
      } else if (opt == 2) {
        int withdrawal = getWithdrawl(scanner);
        balance -= withdrawal;
      } else if (opt == 3) {
        printBalance(balance);
      }

    }

    System.out.println();
    System.out.println("프로그램 종료");
    scanner.close();
  }
}
