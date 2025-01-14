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
  }
}
