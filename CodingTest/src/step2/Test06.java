package step2;

import java.util.Scanner;

public class Test06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hour = sc.nextInt(); // Get user's input for current hour
    int min = sc.nextInt(); // Get user's input for current minute
    int timer = sc.nextInt();// Get user's input for timer setting
    sc.close();

    int hourToMin = hour * 60 + min; // Convert current time to timestamp since 00:00
    int dest = hourToMin + timer; // Calculate timestamp for alarm

    int destHour = dest / 60; // Calculate hour

    while (destHour >= 24) {// If destHour is greater than or equal to 24, subtract 24.
      destHour -= 24;
    }
    int destMin = dest % 60;// Get a number which is not multiples of 60

    System.out.println(destHour + " " + destMin);
  }
}
