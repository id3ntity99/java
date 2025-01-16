package step5;

import java.util.Scanner;

/*-
 * BOJ 1152
 */
public class Test08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    sc.close();

    if (!input.isBlank()) {
      String[] words = input.trim().split("\\s+");
      System.out.println(words.length);
    } else {
      System.out.println(0);
    }
  }
}
