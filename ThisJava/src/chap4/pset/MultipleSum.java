package chap4.pset;

public class MultipleSum {
  public static void main(String[] args) {
    int res = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0) {
        res += i;
      }
    }

    System.out.println("3의 배수의 총합 = " + res);
  }
}
