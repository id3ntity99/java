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
    return scanner.nextInt();
  }

  private static int getUserDeposit(Scanner scanner) {
    System.out.print("예금> ");
    return scanner.nextInt();
  }

  private static int getWithdrawl(Scanner scanner) {
    System.out.print("출금> ");
    return scanner.nextInt();
  }

  public static void main(String[] args) {
    printCols();
    Scanner scanner = new Scanner(System.in);
    int opt = getUserOption(scanner);
    int deposit = getUserDeposit(scanner);
    opt = getUserOption(scanner);
    int withdrawl = getWithdrawl(scanner);
    deposit -= withdrawl;

    scanner.close();
  }
}
