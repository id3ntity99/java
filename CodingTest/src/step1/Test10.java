package step1;

import java.util.Scanner;

public class Test10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    scanner.close();

    int firstLine = x * (y % 10);
    int secondLine = x * ((y % 100) / 10);
    int thirdLine = x * (y / 100);
    int result = x * y;
    System.out.println(firstLine);
    System.out.println(secondLine);
    System.out.println(thirdLine);
    System.out.println(result);
  }
}
