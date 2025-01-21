package sub4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*-
 * 날짜: 2025/01/21
 * 이름: 김철학
 * 내용: Java Stream Mapping 실습
 */
class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return String.format("Person [name = %s, age =%d]", name, age);
  }
}


public class StreamMapTest {
  public static void main(String[] args) {
    List<Person> people = List.of(new Person("김유신", 23), new Person("김춘추", 21),
        new Person("장보고", 33), new Person("강감찬", 43), new Person("이순신", 53));
    System.out.println(people);

    // map(): convert elements into other values.
    people.stream().map(Person::getName).forEach((name) -> System.out.print(name + " "));
    System.out.println();

    List<String> names = people.stream().map(Person::getName).collect(Collectors.toList());
    System.out.println(names);

    int sum = people.stream().mapToInt(Person::getAge).sum();
    System.out.println("Sum of ages = " + sum);

    // flatMap: Convert elements into multiple values.
    List<List<String>> fruits = List.of(Arrays.asList("apple", "banana"),
        Arrays.asList("cherry", "orange"), Arrays.asList("orange", "mango"));
    List<String> fruitList = fruits.stream().flatMap((list) -> {
      return list.stream();
    }).collect(Collectors.toList());
    System.out.println(fruitList);
  }
}
