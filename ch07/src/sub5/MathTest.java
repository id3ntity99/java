package sub5;

public class MathTest {
  public static void main(String[] args) {
    System.out.println("절대값 = " + Math.abs(-5));
    System.out.println("제곱근 = " + Math.sqrt(9));
    System.out.println("올림값 = " + Math.ceil(1.2));
    System.out.println("올림값 = " + Math.ceil(1.8));
    System.out.println("내림값 = " + Math.floor(1.2));
    System.out.println("내림값 = " + Math.floor(1.8));
    System.out.println("반올림 = " + Math.round(1.2));
    System.out.println("반올림 = " + Math.round(1.8));


    // random method
    double rand = Math.random();
    System.out.println("rand = " + rand); // Real number between 0 and 1

    double rand2 = rand * 10;
    System.out.println("rand2 = " + rand2); // Real number between 0 and 10

    double rand3 = Math.ceil(rand2);
    System.out.println("rand3 = " + rand3); // Integer between 1 and 10

    double rand4 = Math.ceil(Math.random() * 45);
    System.out.println("rand4 = " + rand4);

  }
}
