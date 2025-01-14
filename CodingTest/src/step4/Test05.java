package step4;

import java.util.Scanner;

public class Test05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] buf = new int[n];

    for (int i = 0; i < m; i++) {
      int startIdx = sc.nextInt() - 1;
      int endIdx = sc.nextInt() - 1;
      int ballNum = sc.nextInt();
      for (int j = startIdx; j <= endIdx; j++) {
        buf[j] = ballNum;
      }
    }
    sc.close();

    for (int num : buf)
      System.out.print(num + " ");
  }
}
