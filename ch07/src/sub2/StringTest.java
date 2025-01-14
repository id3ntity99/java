package sub2;

public class StringTest {
  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = new String("Hello");

    System.out.println("str1: " + str1);
    System.out.println("str2: " + str2);

    if (str1 == str2) {
      System.out.println("str1 == str2");
    } else {
      System.out.println("str1 != str2");
    }

    if (str1.equals(str2)) {
      System.out.println("str1 == str2");
    } else {
      System.out.println("str1 != str2");
    }

    // 문자열 길이
    String message = "Hello, Korea";
    System.out.println("Length of message: " + message.length());

    // 문자열 추출
    char c1 = message.charAt(0);
    char c2 = message.charAt(6);
    System.out.println("message[0] = " + c1);
    System.out.println("message[6] = " + c2);

    // 문자열 자르기
    String sub1 = message.substring(0, 5);
    String sub2 = message.substring(6);

    System.out.println("message[0] ~ message[5] = " + sub1);
    System.out.println("message[6] ~ message[message.length - 1]  = " + sub2);

    // 문자열 인덱스
    int idx1 = message.indexOf("e"); // Get an index of first 'e'
    int idx2 = message.lastIndexOf("e"); // Get an index of last 'e'

    System.out.println("idx1 = " + idx1);
    System.out.println("idx2 = " + idx2);

    // 문자열 분리
    String[] words = message.split(",");
    for (String word : words) {
      System.out.println(word);
    }

    // 문자열 교체
    String newMessage1 = message.replace("Korea", "Busan");
    String newMessage2 = message.replace("Hello", "Welcome");
    System.out.println(newMessage1);
    System.out.println(newMessage2);

    // 문자열 변환
    int var1 = 1;
    double var2 = 3.14;
    boolean var3 = true;

    String intString1 = Integer.toString(var1);
    String doubleString1 = Double.toString(var2);
    String boolString1 = Boolean.toString(var3);

    String intString2 = String.valueOf(var1); // == ""+var1
    String doubleString2 = String.valueOf(var2);
    String boolString2 = String.valueOf(var3);

    System.out.println("intStr1 = " + intString1);
    System.out.println("doubleStr1 = " + doubleString1);
    System.out.println("boolStr1 = " + boolString1);
    System.out.println("intStr2 = " + intString2);
    System.out.println("doubleStr2 = " + doubleString2);
    System.out.println("boolStr2 = " + boolString2);


  }
}
