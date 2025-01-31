package internal;

import java.util.Scanner;

public class Prompt {
  private String title;
  private String[] options;
  private Scanner sc;

  public Prompt(Scanner sc, String title, String[] options) {
    this.sc = sc;
    this.title = title;
    this.options = options;
  }

  private void printTitle() {
    System.out.print("=============");
    System.out.println(this.title);
    System.out.println("=============");
  }

  private void printOptions() {
    for (int i = 0; i < options.length; i++) {
      System.out.printf("| %d: %s |", i, options[i]);
      if (i != options.length - 1)
        System.out.print(" ");
    }
  }

  public void prompt() {
    while (true) {
      printTitle();
      printOptions();
      System.out.println("선택 >> ");

      int choice = sc.nextInt();

      switch (choice) {
        case 0: {
          break;
        }
        case 1: {
          break;
        }
        case 2: {
          break;
        }
        case 3: {
          break;
        }
        default: {
          break;
        }
      }
    }
  }
}
