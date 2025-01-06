package sub2;

import helper.Delimiter;

public class MethodTypeTest {
  // Parameter 1, Return value 1
  public static double getArea(double r) {
    return r * r * 3.14;
  }

  // Parameter 1, Return value 0
  public static void isTrue(boolean status) {
    if (status)
      System.out.println("It is true");
    else
      System.out.println("It is false");
  }

  // Parameter 0, Return value 1
  public static boolean isGreater() {
    int x = 2;
    int y = 3;
    return x > y;
  }

  // Parameter 0, Return value 0
  public static void getConstArea() {
    double r = 2.3;
    System.out.printf("Area of circle where r = %f: %f", r, getArea(r));
  }

  public static void main(String[] args) {
    double area1 = getArea(1.22);
    double area2 = getArea(2.4);
    System.out.println(area1);
    System.out.println(area2);
    Delimiter.print();

    isTrue(1 < 3);
    isTrue(1 > 2);
    Delimiter.print();

    boolean isGreater = isGreater();
    System.out.println(isGreater);
    Delimiter.print();

    getConstArea();

  }
}
