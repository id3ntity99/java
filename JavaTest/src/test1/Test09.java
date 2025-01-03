package test1;

/**
 * *날짜: 2025/01/03 *이름: 이현민 *내용: 자바 반복문 연습문제
 */
public class Test09 {
  public static void main(String[] args) {
    int cnt = 0;

    for (int i = 1; i <= 9; i++) {
      if (i <= 5) {
        cnt = i; // or cnt++
      } else {
        cnt = 10 - i; // or cnt--

      }

      for (int j = 1; j <= 5 - cnt; j++) {// Print left-padding
        System.out.print(" ");
      }

      for (int k = 1; k <= 2 * cnt - 1; k++) {// Print asterisks
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
