package step2;

import java.util.Scanner;

public class Test07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d1 = sc.nextInt();
    int d2 = sc.nextInt();
    int d3 = sc.nextInt();
    sc.close();

    if (d1 == d2 && d2 == d3)
      System.out.println(10000 + d1 * 1000);
    else if (d1 == d2 || d1 == d3)
      System.out.println(1000 + d1 * 100);
    else if (d2 == d3)
      System.out.println(1000 + d2 * 100);
    else
      System.out.println(Math.max(Math.max(d1, d2), d3) * 100);
  }
}
