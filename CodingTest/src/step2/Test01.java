package step2;

import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    scanner.close();

    if (a > b) {
      System.out.println(">");
    } else if (a < b) {
      System.out.println("<");
    } else {
      System.out.println("==");
    }
  }
}
