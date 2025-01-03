package test1;

/**
 * *날짜: 2025/01/03 *이름: 이현민 *내용: 자바 반복문 연습문제
 */
public class Test08 {
  public static void main(String[] args) {
    int n = 5;

    for (int i = 0; i < n; i++) {
      for (int j = n - 1; j > i; j--) { // Print left-padding
        System.out.print(" ");
      }

      for (int k = 0; k < 2 * i + 1; k++) {// Print odd number of asterisks per line
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
