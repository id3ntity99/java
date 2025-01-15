package step5;

import java.util.Scanner;

/*-
 * BOJ 9086
 */
public class Test03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    String[] strings = new String[t];

    for (int i = 0; i < t; i++) {
      strings[i] = sc.next();
    }

    sc.close();

    for (int i = 0; i < strings.length; i++) {
      String curr = strings[i];
      char firstChar = curr.charAt(0);
      char lastChar = curr.charAt(curr.length() - 1);
      System.out.print(firstChar);
      System.out.print(lastChar);
      System.out.println();
    }
  }
}
