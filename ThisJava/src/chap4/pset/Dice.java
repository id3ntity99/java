package chap4.pset;

public class Dice {
  private static int roll(int min, int max) {
    int range = max - min + 1;
    int res = (int) (Math.random() * range) + min;
    return res;
  }

  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    int sum = 0;

    do {
      x = roll(1, 6);
      y = roll(1, 6);
      System.out.printf("(%d, %d)\n", x, y);
      sum = x + y;
    } while (sum != 5);
  }
}
