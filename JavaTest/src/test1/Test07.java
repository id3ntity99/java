package test1;

/**
 * 날짜: 2025/01/03 이름: 이현민 내용: 1 ~ 10까지 정수 중 2의 배수와 3의 배수 정수의 합 구하기
 */
public class Test07 {
  public static void main(String[] args) {
    int tot = 0;

    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0 || i % 3 == 0)
        tot += i;
    }
    System.out.println("1 ~ 10까지 2와 3배수의 정수의 합: " + tot);
  }
}
