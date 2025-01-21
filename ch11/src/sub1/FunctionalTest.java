package sub1;

/*-
 * 날짜: 2025/01/21
 * 이름: 김철학
 * 내용: Java 함수형 프로그래밍 실습
 */
interface Person {
  public void hello();
}


class Student implements Person {
  @Override
  public void hello() {
    System.out.println("Hello Student!");

  }
}


public class FunctionalTest {
  public static void main(String[] args) {
    // OOP
    Person student = new Student();
    student.hello();

    // Anonyomous Object
    Person dev = new Person() {

      @Override
      public void hello() {
        System.out.println("Hello Developer!");
      }
    };

    dev.hello();

    // Functional Programming(Lambda Expression)
    Person teacher = () -> {
      System.out.println("Hello Teacher!");
    };

    teacher.hello();
  }
}
