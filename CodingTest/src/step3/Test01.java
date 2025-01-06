package step3;

import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();

    for (int i = 1; i < 10; i++) {
      System.out.printf("%d * %d = %d\n", num, i, num * i);
    }
  }
}
