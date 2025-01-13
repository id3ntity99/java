package step4;

import java.util.Scanner;

/*-
 * - BOJ 10813
 * - Swapping two elements of an integer array
 */
public class Test06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] buf = new int[n];

    for (int i = 0; i < n; i++) {
      buf[i] = i + 1;
    }

    for (int j = 0; j < m; j++) {
      int src = sc.nextInt() - 1;
      int dest = sc.nextInt() - 1;
      int tmp = 0;

      tmp = buf[dest];
      buf[dest] = buf[src];
      buf[src] = tmp;

    }
    sc.close();

    for (int k = 0; k < n; k++) {
      System.out.print(buf[k] + " ");
    }
  }
}
