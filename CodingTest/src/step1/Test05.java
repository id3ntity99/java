package step1;

import java.util.Scanner;

public class Test05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    scanner.close();

    System.out.println((double) x / y);
  }
}
