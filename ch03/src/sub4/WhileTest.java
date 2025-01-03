package sub4;

/**
 * 날짜: 2025/01/03 이름: 이현민 내용: Java 반복문 WHile 실습하기
 */
public class WhileTest {

  private static int sum() {
    int cnt = 0;
    int sum = 0;

    while (cnt < 10) {
      sum += ++cnt;
    }
    return sum;
  }

  private static int sumEven() {
    int tot = 0;
    int i = 1;

    do {
      if (i % 2 == 0)
        tot += i;

      i++;
    } while (i <= 10);

    return tot;
  }

  private static int lCommon() {
    int cnt = 1;
    while (true) {
      if (cnt % 5 == 0 && cnt % 7 == 0)
        break;
      cnt++;
    }
    return cnt;
  }

  public static void main(String[] args) {
    // 1부터 10까지 합
    int sum = sum();
    System.out.println(sum);

    // do-while
    int tot = sumEven();
    System.out.println(tot);

    // break
    int lCommon = lCommon();
    System.out.println("5와 7의 최소공배수: " + lCommon);

    // continue
    int total = 0;
    int i = 0;
    while (i <= 10) {
      i++;
      if (i % 2 == 1)
        continue;
      total += i;
    }
    System.out.println(total);


  }
}
