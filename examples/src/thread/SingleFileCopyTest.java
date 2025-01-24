package thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// TODO: Measure execution time
public class SingleFileCopyTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String src = InputHelper.getInput(sc);
    String dest = InputHelper.getInput(sc);

    try (FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dest)) {
      SingleFileCopy copyTask = new SingleFileCopy(in, out);
      Thread thread1 = new Thread(copyTask);
      Thread thread2 = new Thread(copyTask);
      Thread thread3 = new Thread(copyTask);

      thread1.start();
      thread2.start();
      thread3.start();

      while (in.available() > 0) {// Concurrently copy single target-file.
        thread1.run();
        thread2.run();
        thread3.run();
      }

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
