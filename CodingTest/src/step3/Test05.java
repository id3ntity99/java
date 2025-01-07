package step3;

import java.util.Scanner;

public class Test05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    String longString = "long";
    String intString = "int";
    String res = longString + " " + intString;

    int count = (n / 4) - 1;

    for (int i = 0; i < count; i++) {
      res = longString + " " + res;
    }

    System.out.println(res);
  }
}
