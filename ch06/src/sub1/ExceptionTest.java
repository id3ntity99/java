package sub1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*-
 * 날짜: 2025/01/13
 * 이름: 이현민
 * 내용: Java 예외처리 실습하기
 */
public class ExceptionTest {
  public static void main(String[] args) {
    // 실행 예외(Runtime Exception)

    // 예외 상황 1 - 어떤 수를 0으로 나누기
    int num1 = 1;
    int num2 = 0;

    int r1 = num1 + num2;
    int r2 = num1 - num2;
    int r3 = num1 * num2;
    int r4 = 0;
    try {
      r4 = num1 / num2;
    } catch (ArithmeticException e) {
      r4 = num1 / (num2 + 1);
    }

    System.out.println("r1 = " + r1);
    System.out.println("r2 = " + r2);
    System.out.println("r3 = " + r3);
    System.out.println("r4 = " + r4);

    // 예외 상황 2 - Index out of range
    int[] nums = {1, 2, 3, 4, 5};
    int length = nums.length;
    try {
      for (int i = 0; i <= length; i++) {
        System.out.print(nums[i] + " ");
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      length = nums.length - 1;
      for (int i = 0; i <= length; i++) {
        System.out.print(nums[i] + " ");
      }
      System.out.println();
    }

    // 예외 상황 3 - 객체 생성없이 메서드 호출
    Animal animal = null;
    try {
      animal.move();
    } catch (NullPointerException e) {
      animal = new Tiger();
      animal.move();
    }

    // 예외 상황 4 - 잘못된 캐스팅
    Animal a1 = new Tiger();
    Animal a2 = new Eagle();

    Tiger tiger = null;
    Shark shark = null;
    try {
      tiger = (Tiger) a1;
      shark = (Shark) a2;
    } catch (ClassCastException e) {
      if (a1 instanceof Tiger) {
        tiger = (Tiger) a1;
        tiger.move();
        tiger.hunt();
      }
      if (a2 instanceof Shark) {
        shark = (Shark) a2;
        shark.move();
        shark.hunt();
      }

    }


    // 일반 예외(Exception, a.k.a Pre-compilation Exception)
    // 예외 상황 1 - 동적 객체 생성
    try {
      Class clazz = Class.forName("sub1.Eagle");
      Constructor<?> constructor = clazz.getDeclaredConstructor();
      Eagle eagle = (Eagle) constructor.newInstance();

      eagle.move();
      eagle.hunt();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Finally 실행됨...");
    }

    System.out.println("프로그램 정상 종료...");
  }
}
