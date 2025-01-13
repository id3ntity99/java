package sub1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThrowsTest {
  private static final Logger LOGGER = Logger.getLogger("ThrowsTest");

  public static void method2(int n1) throws ArithmeticException, InputMismatchException {
    Scanner sc = new Scanner(System.in);
    System.out.print("n2 입력: ");
    int n2 = sc.nextInt();
    int result = n1 / n2;

    System.out.println("result: " + result);
  }

  public static void method1(int n1) throws ArithmeticException, InputMismatchException {
    method2(n1);
  }

  public static void main(String[] args) {
    try {
      method1(10);
    } catch (Exception e) {
      String msg = String.format("%s is raised...", e.getClass().getName());
      LOGGER.log(Level.INFO, msg);
    }
    LOGGER.log(Level.INFO, "프로그램 정상 종료...");
  }
}
