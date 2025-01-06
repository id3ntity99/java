package sub3;

public class MethodOverloadingTest {
  public static int add(int x) {
    return x + x;
  }

  public static int add(int x, int y) {
    return x + y;
  }

  public static double add(double x, double y) {
    return x + y;
  }

  public static String add(String a, String b) {
    return a + b;
  }


  public static void main(String[] args) {
    int r1 = add(3);
    int r2 = add(1, 2);
    double r3 = add(1.2, 1.8);
    String r4 = add("Korea", ", Republic of");

    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println(r4);
  }
}
