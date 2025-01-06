package step3;

import java.util.Scanner;

public class Test04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total = sc.nextInt();
    int types = sc.nextInt();

    int sum = 0;
    for (int i = 0; i < types; i++) {
      int price = sc.nextInt();
      int number = sc.nextInt();
      sum += price * number;
    }
    sc.close();

    if (sum == total)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
