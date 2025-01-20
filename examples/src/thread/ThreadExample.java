package thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ThreadExample {
  public static void main(String[] args) {
    String src = "C:\\Users\\lotte6\\Desktop\\workspace\\java\\examples\\src\\thread\\dummy.txt";
    String dest =
        "C:\\Users\\lotte6\\Desktop\\workspace\\java\\examples\\src\\thread\\dummy_copy.txt";


    /*
     * TODO: Guess both FileInputStream and FileOutputStream are thread-safe
     */
    try (FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dest)) {
      DummyFileReadWrite readWrite = new DummyFileReadWrite(in, out);
      Thread thread1 = new Thread(readWrite);
      Thread thread2 = new Thread(readWrite);
      Thread thread3 = new Thread(readWrite);

      thread1.start();
      thread2.start();
      thread3.start();


      thread1.join();
      thread2.join();
      thread3.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
