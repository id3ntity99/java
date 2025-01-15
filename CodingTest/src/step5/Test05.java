package step5;

import java.util.Scanner;

/*-
 * BOJ 11720
 */
public class Test05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String strLiteral = sc.next();
    sc.close();

    char[] characters = strLiteral.toCharArray();

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += Character.getNumericValue(characters[i]);
    }

    System.out.println(sum);
  }
}
