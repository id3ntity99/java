package sub3;

/**
 * 날짜: 2024/12/31 이름: 이현민 내용: Java 연산자 실습
 */

public class OperatorTest {
  public static void main(String args[]) {
    // 산술연산자
    int num1 = 1;
    int num2 = 2;
    int num3 = 3;
    int num4 = 4;

    int result1 = num1 + num2;
    int result2 = num1 - num2;
    int result3 = num2 * num3;
    int result4 = num4 / num2;
    int result5 = num4 % num3;

    System.out.printf("result1: %d\n", result1);
    System.out.printf("result2: %d\n", result2);
    System.out.printf("result3: %d\n", result3);
    System.out.printf("result4: %d\n", result4);
    System.out.printf("result5: %d\n", result5);

    // 증감연산자
    int num = 0;
    System.out.printf("Before increment: %d\n", num);
    num++;
    System.out.printf("After increment: %d\n", num);
    ++num;
    System.out.printf("After increment: %d\n", num);
    num--;
    System.out.printf("After increment: %d\n", num);
    --num;
    System.out.printf("After increment: %d\n", num);

    // 복합대입연산자
    int n1 = 1, n2 = 2, n3 = 3, n4 = 4;

    n1 += 1;
    n2 -= 2;
    n3 *= 3;
    n4 /= 4;
    System.out.printf("n1 = %d\n", n1);
    System.out.printf("n2 = %d\n", n2);
    System.out.printf("n3 = %d\n", n3);
    System.out.printf("n4 = %d\n", n4);

    // 비교연산자
    int var1 = 1;
    int var2 = 2;
    boolean res1 = var1 > var2;
    boolean res2 = var1 < var2;
    boolean res3 = var1 >= var2;
    boolean res4 = var1 <= var2;
    boolean res5 = var1 == var2;
    boolean res6 = var1 != var2;

    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
    System.out.println(res4);
    System.out.println(res5);
    System.out.println(res6);

    // 논리연산자
    int var3 = 3;
    int var4 = 4;
    boolean rs1 = (var3 > 3) && (var4 > 3);
    boolean rs2 = (var3 > 2) && (var4 > 3);
    boolean rs3 = (var3 > 3) || (var4 > 3);
    boolean rs4 = (var3 > 3) || (var4 > 5);
    boolean rs5 = !(var3 > var4);

    System.out.println(rs1);
    System.out.println(rs2);
    System.out.println(rs3);
    System.out.println(rs4);
    System.out.println(rs5);

  }
}
