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

    for (int k = 0; k < m; k++) {
      int start = sc.nextInt() - 1;
      int end = sc.nextInt() - 1;
      // TODO: The code below works for sub-array x for which x1 < x2 < x3 ....
      for (int i = start; i < end - 1; i++) {
        int key = buf[i];
        int j = i + 1;
        while (j <= end && key < buf[j]) {
          int tmp = buf[j];
          buf[j] = key;
          buf[j - 1] = tmp;
          j++;
        }
      }
    }
    sc.close();

    for (int i = 0; i < buf.length; i++) {
      System.out.print(buf[i] + " ");
    }
  }
}
