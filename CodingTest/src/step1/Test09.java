package step1;

import java.util.Scanner;

public class Test09 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = scanner.nextInt();
    scanner.close();

    int line1 = (x + y) % z;
    int line2 = ((x % z) + (y % z)) % z;
    int line3 = (x * y) % z;
    int line4 = ((x % z) * (y % z)) % z;

    System.out.println(line1);
    System.out.println(line2);
    System.out.println(line3);
    System.out.println(line4);
  }
}
