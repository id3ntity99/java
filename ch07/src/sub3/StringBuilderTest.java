package sub3;

public class StringBuilderTest {
  public static void main(String[] args) {
    String str = "Hello";
    System.out.println("str : " + str);
    System.out.println("&str = " + System.identityHashCode(str));

    str += "World"; // Appended substring to str
    System.out.println("str : " + str);
    System.out.println("&str = " + System.identityHashCode(str));// Confirmed that new string object
                                                                 // has been created. That is
                                                                 // because Java String is immutable

    // Use StringBuilder to optimize memory space by preventing creating new string object.
    StringBuilder sb = new StringBuilder("Hello");
    System.out.println("sb = " + sb);
    System.out.println("&sb = " + System.identityHashCode(sb));

    sb.append("World");
    System.out.println("sb = " + sb);
    System.out.println("&sb = " + System.identityHashCode(sb));
  }
}
