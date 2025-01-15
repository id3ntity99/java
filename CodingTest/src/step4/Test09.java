package step4;

import java.util.Scanner;

public class Test09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    // Initialize baskets array
    int[] buf = new int[n];
    for (int i = 0; i < n; i++) {
      buf[i] = i + 1;
    }

    for (int i = 0; i < m; i++) {
      int startIdx = sc.nextInt() - 1;
      int endIdx = sc.nextInt() - 1;
      int length = endIdx - startIdx + 1;
      int midIdx = startIdx + (length / 2);

      for (int j = startIdx; j < midIdx; j++) {
        int temp = buf[j];
        int dest = buf[endIdx];
        buf[j] = buf[endIdx];
        buf[endIdx--] = temp;
      }
    }
    sc.close();

    for (int i = 0; i < buf.length; i++) {
      System.out.print(buf[i] + " ");
    }
  }
}
