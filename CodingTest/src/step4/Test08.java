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

    sc.close();
    // Sort the buffer
    for (int i = 1; i < buf.length; i++) {
      int key = buf[i];
      int j = i - 1;
      while (j >= 0 && buf[j] > key) {
        int tmp = buf[j];
        buf[j] = key;
        buf[j + 1] = tmp;
        j--;
      }
    }


    // count duplicated elements from the buf
    int[] temp = new int[buf.length];
    int counter = 0;
    for (int j = 0; j < buf.length - 1; j++) {
      if (buf[j] == buf[j + 1]) {
        counter++;
      }
    }

    System.out.println(buf.length - counter);
  }
}
