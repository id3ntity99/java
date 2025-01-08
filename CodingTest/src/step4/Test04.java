package step4;

import java.util.Scanner;

public class Test04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int n = 9;
    int max = 0;
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      if (x > max) {
        max = x;
        cnt = i + 1;
      }
    }
    sc.close();
    System.out.println(max);
    System.out.println(cnt);
  }
}
