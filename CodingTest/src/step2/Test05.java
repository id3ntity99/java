package step2;

import java.util.Scanner;

public class Test05 {
  private static final int MIN_EARLIER = 45;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int hour = scanner.nextInt();
    int min = scanner.nextInt();
    scanner.close();

    if (MIN_EARLIER > min) {
      hour--; // TODO: Consider 00:00
      min = 60 - (MIN_EARLIER - min);
    } else {
      min -= MIN_EARLIER;
    }

    System.out.print(hour + " " + min);
  }
}
