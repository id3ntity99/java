package sub1;

public class ObjectTest {
  public static void main(String[] args) {
    Object apple1 = new Apple("한국", 3000);
    Object apple2 = new Apple("일본", 2000);

    System.out.println(apple1);
    System.out.println(apple2.toString());

    if (apple1 == apple2) {
      System.out.println("&apple1 == &apple2");
    } else {
      System.out.println("&apple1 != &apple2");
    }

    if (apple1.equals(apple2)) {
      System.out.println("apple1 == apple2");
    } else {
      System.out.println("apple1 != apple2");
    }

    System.out.println(apple1.hashCode());
    System.out.println(apple2.hashCode());
  }
}
