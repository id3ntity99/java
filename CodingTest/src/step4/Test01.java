package step4;

import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] buf = new int[n];
    for (int i = 0; i < n; i++) {
      buf[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    sc.close();

    int cnt = 0;
    for (int j = 0; j < n; j++) {
      if (buf[j] == target)
        cnt++;
    }
    System.out.println(cnt);
  }
}
