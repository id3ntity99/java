package step3;

import java.util.Scanner;

public class Test03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = sc.nextInt();
    sc.close();

    int sum = 0;
    for (int i = 1; i <= max; i++) {
      sum += i;
    }

    System.out.println(sum);
  }
}
