package step4;

import java.util.Scanner;

public class Test07 {
  private static final int STUDENT_NUM = 30;
  private static final int SUBMITTED_STUDENT_NUM = 28;

  public static void main(String[] args) {
    int[] buf = new int[SUBMITTED_STUDENT_NUM];

    // Initialize a buffer of total student numbers.
    for (int i = 1; i <= STUDENT_NUM; i++) {
      buf[i] = i;
    }

    // Do binary search
    Scanner sc = new Scanner(System.in);
    int start, end = 0;
    int min, minNext = 0;
    int mid = buf.length / 2;

    for (int i = 0; i < SUBMITTED_STUDENT_NUM; i++) {
      int key = sc.nextInt();
      if (key > buf[mid]) {
        // Choose right-half of the array.
        start = 0;
        end = mid - 1;
        mid = (int) Math.ceil(end - start + 1);
      } else if (key < buf[mid]) {
        // Choose left-half of the array.
      } else {
        continue;
      }
    }
    sc.close();
    System.out.println(min + " " + minNext);
  }
}
