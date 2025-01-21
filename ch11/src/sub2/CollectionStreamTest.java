package sub2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*-
 * 날짜: 2025/01/21
 * 이름: 김철학
 * 내용: Java CollectionStream 실습
 */
class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("Person [name = %s, age =%d]", name, age);
  }
}


public class CollectionStreamTest {
  public static void main(String[] args) {
    List<String> people = new ArrayList<>();
    people.add("김유신");
    people.add("김춘추");
    people.add("장보고");
    people.add("강감찬");
    people.add("이순신");

    // Using external iterator; The loop & Iterator<E>
    for (String person : people)
      System.out.println(person);

    Iterator<String> iter = people.iterator();
    while (iter.hasNext()) {
      System.out.println(iter.next());
    }

    // Using internal iterator; stream.forEach
    people.stream().forEach(System.out::println);

    List<Person> friends = new ArrayList<>();
    friends.add(new Person("김유신", 23));
    friends.add(new Person("김춘추", 21));
    friends.add(new Person("장보고", 33));
    friends.add(new Person("강감찬", 43));
    friends.add(new Person("이순신", 53));

    // Use external iterator
    for (Person friend : friends) {
      System.out.println(friend);
    }

    Iterator<Person> friendIter = friends.iterator();
    while (friendIter.hasNext()) {
      System.out.println(friendIter.next());
    }

    // Internal iterator with lambda
    friends.stream().forEach(System.out::println);
  }
}
