package sub6;

/*-
 * 날짜: 2025/01/10
 * 이름: 이현민
 * 내용: Java 다형성 실습하기
 * 
 * 다형성(Polymorphism)
 *  - 상속관계에서 부모클래스의 기능이 자식클래스에서 다양한 기능으로 변하는 특징
 *  - 객체 참조변수의 타입선언을 부모클래스 타입으로 선언한다
 *  
 */
public class PolyTest {
  public static void main(String[] args) {
    // 다형성을 적용한 객체 생성(업캐스팅)
    Animal a1 = new Tiger();
    Animal a2 = new Eagle();
    Animal a3 = new Shark();

    a1.move();
    a1.hunt();

    a2.move();
    a2.hunt();

    a3.move();
    a3.hunt();

    // 다운캐스팅
    Tiger tiger = (Tiger) a1;
    Eagle eagle = (Eagle) a2;
    Shark shark = (Shark) a3;

    tiger.move();
    tiger.hunt();

    eagle.move();
    eagle.hunt();

    shark.move();
    shark.hunt();

    // 캐스팅 비교연산
    if (a1 instanceof Tiger) {
      System.out.println("a1 is instance of Tiger");
    } else if (a2 instanceof Eagle) {
      System.out.println("a1 is instance of Eagle");
    } else if (a3 instanceof Shark) {
      System.out.println("a1 is instance of Shark");
    }

    // 다형성을 활용한 객체의 배열
    Animal[] animals = {tiger, shark, eagle};

    for (Animal animal : animals) {
      animal.move();
      animal.hunt();
    }
  }
}
