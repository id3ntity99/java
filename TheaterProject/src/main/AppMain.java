package main;

import java.util.Scanner;
import java.util.logging.Logger;
import controller.MoviesController;
import internal.Prompt;

public class AppMain {
  private static final Logger LOGGER = Logger.getLogger(AppMain.class.getName());

  public AppMain() {
    // TODO Auto-generated constructor stub
  }

  public static void main(String[] args) {
    String[] options = {"Exit", "Movies", "Customers", "Booking"};

    Prompt prom = new Prompt("Theater Management System", options, ">>");
    Scanner sc = new Scanner(System.in);

    boolean isRunning = true;

    prom.printTitle();
    while (isRunning) {
      prom.printOptions();
      prom.printInputSymbol();
      int choice = sc.nextInt();

      switch (choice) {
        case 1: {
          LOGGER.info("Terminating system...");
          isRunning = false;
          break;
        }
        case 2: {
          MoviesController.getInstance().run(sc);
          break;
        }
        case 3: {
          break;
        }
        case 4: {
          break;
        }
        default:
          LOGGER.info("");
          break;
      }
    }
    sc.close();
  }
}
