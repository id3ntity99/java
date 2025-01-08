package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Don't know reason but this code is not judged by BOJ.
 */
public class Test03InsertionSort {
  public static void main(String[] args) throws IOException {
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(in);

    // Read the buffer and turn it into an array of integers.
    int len = Integer.parseInt(reader.readLine());
    String[] numsStr = reader.readLine().split(" ");
    int[] nums = new int[len];
    for (int i = 0; i < len; i++) {
      nums[i] = Integer.parseInt(numsStr[i]);
    }

    // Do insertion sort
    for (int i = 0; i < len - 1; i++) {
      int key = 0;
      int j = i;
      while (j >= 0 && (nums[j] > nums[j + 1])) {
        key = nums[j + 1];
        nums[j + 1] = nums[j];
        nums[j] = key;
        j--;
      }
    }

    // Print output
    System.out.println(nums[0] + " " + nums[len - 1]);
    reader.close();
  }
}
