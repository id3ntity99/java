package sub3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*-
 * 날짜: 2025/01/21
 * 이름: 김철학
 * 내용: Java CollectionStream 실습
 */
public class StreamFilterTest {
  public static void main(String[] args) {
    // Create a list
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);
    System.out.println(numbers);

    // Eliminate duplicates
    numbers.stream().distinct().forEach(num -> System.out.print(num + " "));
    System.out.println();

    // Filter numbers greater than 5
    numbers.stream().filter(num -> !(num >= 5)).forEach(num -> System.out.print(num + " "));
    System.out.println();

    // Filter numbers so that there are no duplicates, even numbers only, in descending order
    numbers.stream().distinct().filter(num -> num % 2 == 0).sorted(Collections.reverseOrder())
        .forEach(num -> System.out.print(num + " "));
  }
}
