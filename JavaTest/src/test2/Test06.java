package test2;

/*-
 * 날짜: 2025/01/10 
 * 이름: 이현민 
 * 내용: 자바 메서드 연습문제
 */
import java.util.Scanner;

public class Test06 {
  public static void intro() {
    System.out.println("**********Start**********");
    System.out.println("두개 정수를 입력");
  }

  public static int input(Scanner sc, String name) {
    System.out.print("변수 " + name + " 값 입력: ");
    return sc.nextInt();
  }

  public static void result(int value) {
    System.out.println("덧셈 결과 : " + value);

    System.out.println("***********End***********");
  }

  public static int add(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    intro();

    int a = input(sc, "a");
    int b = input(sc, "b");

    int output = add(a, b);
    result(output);

    sc.close();
  }
}
