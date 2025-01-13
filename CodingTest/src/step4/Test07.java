package step4;

import java.util.Scanner;

public class Test07 {
  private static boolean search(int key, int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    int mid = (start + end) / 2;
    while (start <= end) {
      if (key == arr[mid])
        return true;
      else if (key < arr[mid]) {
        // Select left-half
        end = mid - 1;
        mid = (start + end) / 2;
      } else if (key > arr[mid]) {
        // Select right-half
        start = mid + 1;
        mid = (start + end) / 2;
      }
    }
    return false;
  }

  private static int[] initArray(int len) {
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
      arr[i] = i + 1;
    }
    return arr;
  }

  private static int[] initArray(int len, Scanner sc) {
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    return arr;
  }

  private static void sort(int[] buf) {
    for (int i = 0; i < buf.length - 1; i++) {
      int key = buf[i + 1];
      int j = i;
      while (j >= 0 && buf[j] > key) {
        int tmp = buf[j];
        buf[j] = key;
        buf[j + 1] = tmp;
        j--;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = initArray(30); // Initialize an array that contains numbers from 1 to 30.
    int[] inBuf = initArray(28, new Scanner(System.in)); // Get all user input in an array

    sort(inBuf);

    for (int i = 0; i < arr.length; i++) {
      boolean isContained = search(arr[i], inBuf);
      if (!isContained) {
        System.out.println(arr[i]);
      }
    }
  }
}
