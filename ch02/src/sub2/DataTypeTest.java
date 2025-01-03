package sub2;

/**
 * 날짜: 2024/12/31
 * 이름: 이현민
 * 내용: Java 자료형 실습하기
 */
public class DataTypeTest {
	public static void main(String[] args) {
		//정수형
		byte num1 = 127;
		short num2 = 32767;
		int num3 = Integer.MAX_VALUE;
		long num4 = Long.MAX_VALUE;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("num4: " + num4);

		//실수형
		float var1 = 0.123456789f;
		double var2 = 0.123456789; 

		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);

		//논리형
		boolean isFalse = true;
		boolean isTrue = false;

		System.out.println("isTrue: " + isTrue);
		System.out.println("isFalse: " + isFalse);
		
		//문자형
		char ch1 = 'a';
		char ch2 = '가';
		
		System.out.println("ch1: " + ch1);
		System.out.println("ch2: " + ch2);

		//문자열
		String word1 = "A";
		String word2 = "Computer";

		System.out.println("word1: " + word1);
		System.out.println("word2: " + word2);
	}
}