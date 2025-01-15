package step4;

import java.util.Scanner;

public class Test10 {
  private static int getMax(int[] scores) {
    int max = 0;
    for (int score : scores) {
      if (score > max)
        max = score;
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] scores = new int[n];
    for (int i = 0; i < n; i++) {
      scores[i] = sc.nextInt();
    }
    sc.close();

    int max = getMax(scores);

    double[] fixedScores = new double[n];

    for (int i = 0; i < n; i++) {
      fixedScores[i] = ((double) scores[i] / (double) max) * 100;
    }

    double sum = 0.0;
    for (double fixedScore : fixedScores) {
      sum += fixedScore;
    }

    System.out.println(sum / n);
  }
}
