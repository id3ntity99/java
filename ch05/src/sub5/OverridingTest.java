package sub5;

/*
 * 날짜: 2025/01/09 이름: 이현민 내용: Java Overriding 실습하기
 */
class AAA {
  public void method1() {
    System.out.println("AAA.method1()...");
  }

  public void method2() {
    System.out.println("AAA.method2()...");
  }

  public void method3() {
    System.out.println("AAA.method3()...");
  }
}


class BBB extends AAA {
  @Override
  public void method2() {
    System.out.println("BBB.method2()...");
  }

  // method3 overloaded
  public void method3(int a) {
    System.out.println("BBB.method3()...");
  }
}


class CCC extends BBB {
  @Override
  public void method1() {
    System.out.println("CCC.method1()...");
  }

  @Override
  public void method2() {
    System.out.println("CCC.method2()...");
  }

  // method3 overloaded
  public void method3(int a, int b) {
    System.out.println("CCC.method3()...");
  }
}


public class OverridingTest {
  public static void main(String[] args) {
    CCC c = new CCC();
    c.method1();
    c.method2();
    c.method3();
    c.method3(1);
    c.method3(1, 2);

    Sedan sonata = new Sedan("Sonata", "white", 0, 2000);
    Truck bongo = new Truck("Bongo", "blue", 0, 0);

    sonata.speedUp(200);
    sonata.show();

    bongo.load(10);
    bongo.speedUp(80);
    bongo.show();
  }
}
