package step3;

import java.util.Scanner;

public class Test07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int[] results = new int[t];
    for (int i = 0; i < t; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      results[i] = x + y;
    }
    sc.close();

    for (int j = 0; j < t; j++) {
      System.out.printf("Case #%d: %d\n", j + 1, results[j]);
    }
  }
}
