package step4;

import java.util.Scanner;

public class Test08 {
  public static void main(String[] args) {
    int[] buf = new int[10];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < buf.length; i++) {
      int operand = sc.nextInt();
      buf[i] = operand % 42;
    }

    int cnt = 0;
    int key = buf[0];
    for (int j = 1; j < buf.length; j++) {
      if (key != buf[j]) {
        cnt++;
      }
    }

  }
}
