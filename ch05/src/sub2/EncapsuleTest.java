package sub2;

/**
 * 날짜: 2025/01/07 이름:이현민 내용: Java 클래스 캡슐화 실습하기
 */
public class EncapsuleTest {
  public static void main(String[] args) {
    // Using construct instead of attributes reference.
    Car tuscon = new Car("Tuscon", "Black", 10);
    tuscon.speedUp(100);
    tuscon.show();

    // These codes violate encapsulation principle of OOP by referencing attributes
    // from outside of the object.
    // tuscon.name = "Tuscon";
    // tuscon.color = "Black";
    // tuscon.speed = 10;

    Car avante = new Car("Avante", "Black", 10);
    avante.speedUp(20);
    avante.speedDown(10);
    avante.show();

    // Using getters for retrieving attribute values, setters for modifying attribute values.
    Car car = new Car("Sportage", "White", 0);
    car.show();

    car.setName("Grandeur");
    car.setColor("Gray");

    String newName = car.getName();
    String newColor = car.getColor();
    System.out.println("Changed name: " + newName);
    System.out.println("Changed color: " + newColor);

    // Initialize Account object with encapsulation.
    Account myAcc = new Account();
    myAcc.setBank("우리은행");
    myAcc.setId("110-11-1211");
    myAcc.setName("김춘추");
    myAcc.setBalance(23000);

    myAcc.deposit(2000);
    myAcc.withdraw(10000);

    myAcc.print();

    // Then, change the account information using setters.
    myAcc.setBank("국민은행");
    myAcc.setId("110-22-2122");
    myAcc.setName("김유신");
    myAcc.setBalance(1000000);

    myAcc.print();
  }
}
