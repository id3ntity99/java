package sub2;

import java.util.Scanner;

public class SwitchTest {
  public static void main(String[] args) {
    System.out.print("숫자 입력:");

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    switch (number % 2) {
      case 0:
        System.out.println("The nubmer you gave is even.");
        break;
      case 1:
        System.out.println("The nubmer you gave is odd.");
        break;
      default:
        break;

    }
    scanner.close();
  }
}
