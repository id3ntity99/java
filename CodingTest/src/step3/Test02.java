package step3;

import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    int outs[] = new int[times];

    for (int i = 0; i < times; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      outs[i] = x + y;
    }

    sc.close();

    for (int i = 0; i < times; i++) {
      System.out.println(outs[i]);
    }
  }
}
