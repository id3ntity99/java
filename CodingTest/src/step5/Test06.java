package step5;

import java.util.Scanner;

/*-
 * BOJ 10809
 */
public class Test06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    sc.close();
    byte[] strBytes = str.getBytes();
    byte currCode = 'a';
    byte endCode = 'z';
    while (currCode <= endCode) {
      // Check if currCode exists in the strBytes. If exists, get an index and break.
      boolean doesExist = false;
      int index = 0;

      for (int i = 0; i < strBytes.length; i++) {
        if (currCode == strBytes[i]) {
          doesExist = true;
          index = i;
          break;
        }
      }


      if (doesExist) // If it exists
        System.out.print(index + " ");
      else // If it does not exist
        System.out.print(-1 + " ");
      currCode++;
    }

  }
}
