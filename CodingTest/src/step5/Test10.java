package step5;

import java.util.Scanner;

/*-
 * BOJ 5622
 */
public class Test10 {
  private static final char[][] DIALS =
      {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
          {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next().toLowerCase();
    sc.close();

    char[] words = input.toCharArray();
    int seconds = 0;
    for (char word : words) {// Find a dial number that corresponds to the given alphabet
      int dialNumber = 0;

      for (int i = 0; i < DIALS.length; i++) {
        char[] alphabets = DIALS[i];
        for (int j = 0; j < alphabets.length; j++) {
          if (alphabets[j] == word) {
            dialNumber = i + 2;
            break;
          }
        }
      }

      // Time required to turn the dial for a number n is equal to n + 1 seconds,
      // except zero which takes 11 seconds
      if (dialNumber == 0)
        seconds += 11;
      else
        seconds += dialNumber + 1;

    }
    System.out.println(seconds);
  }
}
