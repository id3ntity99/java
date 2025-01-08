package sub3;

/**
 * 날짜: 2025/01/08 이름: 이현민 내용: Java 클래스 변수, 메서드 실습하기
 * 
 * 클래스 변수, 클래스 메서드(정적변수, 정적메서드) <br>
 * - static 키워드를 선언한 변수, 메서드. <br>
 * - Method area(클래스가 저장되는) 메모리 영역에 생성되므로 모든 객체에 공유된다. <br>
 * - 객체를 생성하지 않고 클래스를 통해 사용한다. <br>
 * 
 * 싱글톤 객체 <br>
 * - static pattern은 단일한 객체를 생성하여 Method area에 저장해 사용하는 design pattern이다. </br>
 * - 단일한 객체를 사용하므로 메모리가 절약되는 장점이 있지만, 멀티스레딩의 경우에서는 race condition이 발생 할 수 있는 등의 <br>
 * 단점이 있어 good practice라고 하기엔 어렵다.
 * 
 */
public class StaticTest {
  public static void main(String[] args) {
    Car tuscon = new Car("Tuscon", "black", 0);
    Car avante = new Car("Avante", "white", 20);
    Car grandeur = new Car("Grandeur", "silver", 40);

    tuscon.show();
    avante.show();
    grandeur.show();

    /*
     * Theses lines will print 3. Because we instantiated three instances of the Car class, and the
     * 'count' attribute is static. A static attribute is belong to the class that contains the
     * static attribute, which means the attribute is shared among instances of the class.
     */
    int numOfCars = Car.getCount(); // Or, use Car.count
    System.out.println(numOfCars);

    Increment inc1 = new Increment();
    Increment inc2 = new Increment();
    Increment inc3 = new Increment();

    Calc c1 = Calc.getInstance();
    int res = c1.add(1, 2);
    System.out.println(res);

    Calc c2 = Calc.getInstance();
    res = c2.subtract(1, 2);
    System.out.println(res);

    // Check that c1 and c2 are same instance, i.e. a singleton
    System.out.println(c1.equals(c2));
  }
}
