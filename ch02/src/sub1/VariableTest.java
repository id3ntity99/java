package sub1;

/**
 * 날짜: 2024/12/31
 * 이름: 이현민
 * 내용: 변수: ch02. 변수와 연산자 
 */

public class VariableTest {
	public static void main(String[] args) {
		//Variable
		int a = 3; //Variable initialization
		int b = 7;
		System.out.println("a 값: " + a);
		System.out.println("b 값: " + b);
		
		a = 5; //Re-allocation
		b = 9;
		
		System.out.println("a 값: " + a);
		System.out.println("b 값: " + b);

		//Constant
		final int NUM = 5;
		System.out.println("NUM 값(상수): " + NUM);
	}
}
