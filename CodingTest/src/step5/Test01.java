package step5;

import java.util.Scanner;

/*-
 * BOJ 27866
 */
public class Test01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int index = sc.nextInt() - 1;
    sc.close();

    char ch = str.charAt(index);
    System.out.println(ch);
  }
}
