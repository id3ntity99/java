package test1;

import java.util.Scanner;

/**
 * 날짜: 2025/01/03 이름: 이현민 내용: 자바 연산자 연습문제
 */
public class Test02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int year;
    int birth;
    String name;

    System.out.print("올해 년도 입력: ");
    year = sc.nextInt();

    System.out.print("태어난 연도 입력: ");
    birth = sc.nextInt();

    System.out.print("이름 입력: ");
    name = sc.next();

    int age = year - birth;

    System.out.printf("%s님 안녕하세요.\n당신은 올해 %d세 입니다.\n", name, age);

    sc.close();
  }
}
