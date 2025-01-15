package step5;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*-
 * BOJ 11654
 */
public class Test04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String in = sc.next();

    sc.close();

    byte[] bytes = in.getBytes(StandardCharsets.US_ASCII);
    System.out.println(bytes[0]);
  }
}
