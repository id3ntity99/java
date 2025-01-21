package sub1;

/*-
 * 날짜: 2025/01/21
 * 이름: 김철학
 * 내용: Java 람다식 실습
 */

/*-
 * This annotation tells JVM that this interface is going to be used as a 
 * Lambda Expression
 */
@FunctionalInterface
interface A {
  public int method(int a, int b);
}


@FunctionalInterface
interface B {
  public void method(double a);
}


@FunctionalInterface
interface C {
  public boolean method();
}


@FunctionalInterface
interface D {
  public void method();
}


@FunctionalInterface
interface E {
  public double method(double nim);
}


public class LambdaTest {
  public static void main(String[] args) {
    // Define Lambda
    A a1 = (int a, int b) -> {
      return a + b;
    };

    A a2 = (a, b) -> {
      return a + b;
    };

    A a3 = (a, b) -> a + b; // Curly bracket is missing; The method returns a + b immediately.

    System.out.println(a1.method(1, 2));
    System.out.println(a2.method(3, 4));
    System.out.println(a3.method(5, 6));

    B b1 = (double a) -> {
      System.out.println("a * 100 = " + a * 100);
    };

    B b2 = a -> System.out.println("a * 1000 = " + a * 1000);

    B b3 = System.out::println; // Lambda method reference

    b1.method(3.14);
    b2.method(3.14);
    b3.method(3.14);

    C c1 = () -> {
      return true;
    };

    C c2 = () -> false;

    System.out.println(c1.method());
    System.out.println(c2.method());

    D d1 = () -> {
      System.out.println("Calling d1...");
    };

    D d2 = () -> System.out.println("Calling d2...");

    d2.method();
    d1.method();

    E e1 = Math::ceil;
    E e2 = Math::floor;
    E e3 = Math::round;

    System.out.println(e1.method(3.14));
    System.out.println(e2.method(2.9));
    System.out.println(e3.method(3.45));


    // Thread with Lambda
    Runnable task = () -> { // Define new Runnable implementation with Lambda expression.
      for (int i = 0; i < 10; i++) {
        System.out.println("Worker thread is running...");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };

    Thread thread = new Thread(task);
    thread.start();

    for (int i = 0; i < 10; i++) {
      System.out.println("Main tread is running...");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("Programm terminated...");
  }
}
