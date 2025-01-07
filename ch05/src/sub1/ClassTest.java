package sub1;

/**
 * 날짜: 2025/01/07 이름: 이현민 내용: Java 클래스 실습하기
 */
public class ClassTest {
  public static void main(String[] args) {
    // Instantiate Car class
    Car myCar = new Car();

    // Initialize object
    myCar.name = "Tuscon";
    myCar.color = "Black";
    myCar.speed = 0;

    // Interact with object
    myCar.speedUp(80);
    myCar.show();
    myCar.speedDown(30);
    myCar.show();


    Car sportage; // Declare an object
    sportage = new Car(); // Instantiate the class

    // Initialize object
    sportage.name = "Sportage";
    sportage.color = "White";
    sportage.speed = 10;


    sportage.speedUp(80);
    sportage.show();
    sportage.speedDown(30);
    sportage.show();

    // Instantiate Account class
    Account tossAccount = new Account();
    tossAccount.bank = "Toss";
    tossAccount.id = "123-45678-90";
    tossAccount.name = "Lee";
    tossAccount.balance = 10000;

    tossAccount.deposit(100000);
    tossAccount.withdraw(50000);
    tossAccount.print();

    Account wooriAccount = new Account();
    wooriAccount.bank = "우리은행";
    wooriAccount.id = "110-11-1021";
    wooriAccount.name = "김춘추";
    wooriAccount.balance = 15000;
  }
}
