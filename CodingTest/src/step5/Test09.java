package step5;

import java.util.Scanner;

/*-
 * BOJ 2908
 */
public class Test09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String xStr = sc.next();
    String yStr = sc.next();
    sc.close();

    String revXStr = new StringBuilder(xStr).reverse().toString();
    String revYStr = new StringBuilder(yStr).reverse().toString();

    int x = Integer.parseInt(revXStr);
    int y = Integer.parseInt(revYStr);

    if (x > y)
      System.out.println(x);
    else
      System.out.println(y);

  }
}
