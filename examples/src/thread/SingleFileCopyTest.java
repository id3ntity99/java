package thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.util.logging.Logger;

public class SingleFileCopyTest {
  private static final Logger LOGGER = Logger.getLogger(SingleFileCopyTest.class.getName());

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String src = InputHelper.getInput("Source file path: ", sc);
    String dest = InputHelper.getInput("Destination Path: ", sc);

    try (FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dest)) {
      SingleFileCopy copyTask = new SingleFileCopy(in, out);
      Thread thread1 = new Thread(copyTask);
      Thread thread2 = new Thread(copyTask);
      Thread thread3 = new Thread(copyTask);

      thread1.start();
      thread2.start();
      thread3.start();

      Instant start = Instant.now();

      while (in.available() > 0) {// Concurrently copy single target-file.
        thread1.run();
        thread2.run();
        thread3.run();
      }

      Instant finish = Instant.now();
      long timeElapsed = Duration.between(start, finish).toSeconds();
      String msg = String.format("Time Elapsed: %d seconds", timeElapsed);
      LOGGER.info(msg);

      thread1.join();
      thread2.join();
      thread3.join();

    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    sc.close();
  }
}
