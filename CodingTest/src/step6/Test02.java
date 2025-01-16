package step6;

import java.util.Scanner;

/*-
 * BOJ 3003
 */
public class Test02 {
  public static void main(String[] args) {
    final int[] totalPieces = {1, 1, 2, 2, 2, 8};
    int[] currentPieces = new int[totalPieces.length];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < totalPieces.length; i++) {
      currentPieces[i] = sc.nextInt();
    }

    sc.close();

    for (int i = 0; i < currentPieces.length; i++) {
      System.out.print((totalPieces[i] - currentPieces[i]) + " ");
    }
  }
}
