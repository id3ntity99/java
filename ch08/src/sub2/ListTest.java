package sub2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import sub1.Apple;

/*-
 *  날짜: 2025/01/15
 *  이름: 이현민
 *  내용: Java 콜렉숀 List 실습하기
 */
public class ListTest {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();

    integers.add(1);
    integers.add(2);
    integers.add(3);
    integers.add(4);
    integers.add(5);

    // Insert integer
    integers.add(1, 6);

    // Remove integer
    integers.remove(1);

    // List iteration 1: Lambda expression
    integers.forEach((integer) -> {
      System.out.println(integer);
    });

    // List iteration 2: Method referece
    integers.forEach(System.out::println);

    // List iteration 3: for loop
    for (int integer : integers) {
      System.out.println(integer);
    }

    List<String> persons = new ArrayList<>();
    persons.add("김유신");
    persons.add("김춘추");
    persons.add("장보고");
    persons.add("강감찬");
    persons.add("이순신");

    persons.addLast("정약용");
    persons.add(4, "이성계");
    persons.add(persons.indexOf("김춘추"), "선덕여왕");
    persons.remove(3);
    persons.add(3, "왕건");

    // Object List
    List<Apple> apples = new ArrayList<>();
    Apple apple1 = new Apple("South Korea", 3000);
    Apple apple2 = new Apple("USA", 3000);
    Apple apple3 = new Apple("Japan", 3000);

    apples.add(apple1);
    apples.add(apple2);
    apples.add(apple3);

    for (Apple apple : apples) {
      System.out.println(apple);
    }

    // Linked list
    List<String> cities = new LinkedList<>();
    cities.add("서울");
    cities.add("대전");
    cities.add("대구");
    cities.add("부산");
    cities.add("광주");

    cities.add(1, "수원");
    cities.addFirst("인천");
    cities.addLast("울산");
  }
}
