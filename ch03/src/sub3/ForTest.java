package sub3;

public class ForTest {
  public static int add() {
    int res = 0;
    for (int i = 0; i < 10; i++) {
      res += (i + 1);
    }
    return res;
  }

  public static int addEven() {
    int res = 0;
    for (int i = 0; i < 10; i++) {
      int curr = i + 1;
      if (curr % 2 == 0) {
        res += curr;
      }
    }
    return res;
  }

  public static void printMultiTable() {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 9; j++) {
        int coeff1 = i + 2;
        int coeff2 = j + 1;
        System.out.printf("%dx%d = %d\n", coeff1, coeff2, coeff1 * coeff2);
      }
    }
  }

  public static void printNestedForLoop() {
    System.out.println("Here is a pattern of the nested for loop.");
    for (int i = 0; i < 4; i++) {
      System.out.println("i = " + i);
      for (int j = 0; j < 6; j++) {
        System.out.println("j = " + j);
      }
    }

  }

  public static void printStars() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < (i + 1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printRevStars() {
    System.out.println("Printing asterisk triangle in reverse...");
    for (int i = 4; i >= 0; i--) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printDelimiter() {
    System.out.println("=============================================================");
  }

  public static void main(String[] args) {
    // 1부터 10까지 합
    System.out.println("1부터 10까지의 합 = " + add());
    printDelimiter();

    // 1부터 10까지 짝수합
    System.out.println("1부터 10까지 짝수의 합 = " + addEven());
    printDelimiter();

    // for 중첩
    printNestedForLoop();
    printDelimiter();

    // 구구단
    printMultiTable();
    printDelimiter();

    // 별삼각형
    printStars();
    printDelimiter();

    // 별 역삼각형
    printRevStars();
  }
}
