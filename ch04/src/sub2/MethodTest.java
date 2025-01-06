package sub2;

/**
 * 날짜: 2025/01/06 이름: 이현민 내용: Java 메서드 실습하기
 */
public class MethodTest {
  /**
   * static method는 클래스의 인스턴스를 생성하지 않고 그 클래스의 메서드를 사용하고자 할떄 사용. static method 내에서 다른 static method를
   * 호출하고자 한다면 callee method 또한 static method 이어야 함. <br>
   * static 메서드는 클래스의 instantiation(인스턴스화) 없이 사용되는 메서드. 따라서 인스턴스화 되어야만 사용할 수 있는 일반적인 메서드는 static
   * method 내에서 사용될 수 없음.
   */
  public static int fx(int x) {
    int y = 2 * x + 3;
    return y;
  }

  // Main method; Entry point of java program
  public static void main(String[] args) {
    int y = fx(3);
    System.out.printf("f(x) = 2x + 3,\nf(3) = %d\n", y);
  }
}
