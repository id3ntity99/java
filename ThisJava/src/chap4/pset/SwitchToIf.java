package chap4.pset;

/**
 * @author 이현민
 * @implNote "조건문과 반복문" 확인문제(pp.140-141)
 */
public class SwitchToIf {
  public static void main(String[] args) {
    String grade = "B";
    int score = 0;

    if (grade == "A") {
      score = 100;
    } else if (grade == "B") {
      int result = 100 - 20;
      score = result;
    } else {
      score = 60;
    }
    System.out.println(score);
  }
}
