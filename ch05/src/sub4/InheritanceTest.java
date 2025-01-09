package sub4;

/**
 * 날짜: 2025/01/09 이름: 이현민 내용: Java 클래스 상속 실습하기
 */

class Parent {
  private int x;
  private int y;

  public Parent(int x, int y) {
    this.x = x;
    this.y = y;

  }

  public int add() {
    return x + y;
  }
}


class Child extends Parent {
  private int a;
  private int b;

  public Child(int a, int b) {
    super(a, b);
    this.a = a;
    this.b = b;
  }

  public int subtract() {
    return a - b;
  }

}


public abstract class InheritanceTest {
  public static void main(String[] args) {
    Parent p = new Parent(2, 3);
    Child c = new Child(1, 2);

    System.out.println(p.add());
    System.out.println(c.add());
    System.out.println(c.subtract());

    Sedan sonata = new Sedan("Sonata", "white", 0, 2000);
    sonata.speedUp(80);
    sonata.turbo();
    sonata.speedUp(20);
    sonata.show();

    Truck bongo = new Truck("Bongo", "Blue", 0, 0);
    bongo.load(100);
    bongo.speedUp(60);
    bongo.show();

    StockAccount kb = new StockAccount("KB", "123-456-789", "John Doe", 10000, "Samsung", 0, 50000);
    kb.deposit(1000000);
    kb.buy(10, 50000);
    kb.show();

    kb.sell(5, 60000);
    kb.show();

    Person person = new Person("Alice", 20);
    Doctor doctor = new Doctor("Stephen Strange", 36, "Physical Surgery");
    Engineer engineer = new Engineer("Bertram Gilfoyle", 28, "System Architect");
    person.introduce();
    person.work();
    doctor.introduce();
    doctor.work();
    engineer.introduce();
    engineer.work();
  }
}
