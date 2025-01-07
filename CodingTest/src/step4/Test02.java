package step4;

import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] buf = new int[n];
    for (int i = 0; i < n; i++) {
      buf[i] = sc.nextInt();
    }
    sc.close();

    int cnt = 0;
    for (int i = 0; i < n; i++) {
      if (buf[i] < x) {
        System.out.print(buf[i]);
      }

    }
  }
}
