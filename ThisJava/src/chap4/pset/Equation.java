package chap4.pset;

public class Equation {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      int nomialX = 4 * i;
      for (int j = 1; j < 10; j++) {
        int nomialY = 5 * j;
        if (nomialX + nomialY == 60) {
          System.out.printf("(%d, %d)", i, j);
          break;
        }
      }
    }
  }
}
