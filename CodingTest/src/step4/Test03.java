package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03 {
  public static void main(String[] args) throws IOException {
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(in);

    int n = Integer.parseInt(reader.readLine());
    String[] nums = reader.readLine().split(" ");
    int max = 0;
    int min = 0;
    for (int i = 0; i < n; i++) {
      int temp = Integer.parseInt(nums[i]);
      if (i == 0)
        max = min = temp;
      if (temp > max)
        max = temp;
      if (temp < min)
        min = temp;

    }
    reader.close();
    System.out.println(min + " " + max);
  }
}
