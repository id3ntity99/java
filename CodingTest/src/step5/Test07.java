package step5;

import java.util.Scanner;

/*-
 * BOJ 2675
 */
public class Test07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      StringBuilder sb = new StringBuilder();
      int r = sc.nextInt();
      String s = sc.next();
      char[] characters = s.toCharArray();
      for (char ch : characters) {
        for (int j = 0; j < r; j++) {
          sb.append(ch);
        }
      }
      System.out.println(sb);
    }

    sc.close();
  }
}
