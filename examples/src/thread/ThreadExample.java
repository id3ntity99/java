package thread;

import java.io.File;

public class ThreadExample {
  public static void main(String[] args) {
    String srcPath = "C:\\Users\\lotte6\\Desktop\\workspace\\java\\ch10\\src\\example\\dummy.txt";
    File src = new File(srcPath);

    String destPath = "C:\\Users\\lotte6\\Desktop\\workspace\\java\\ch10\\src\\example\\copy.txt";
    File dest = new File(destPath);
    try (DummyFileReader reader = new DummyFileReader(src, dest)) {
      Runnable runnable = new DummyThread(reader);
      Thread dt1 = new Thread(runnable);
      Thread dt2 = new Thread(runnable);
      Thread dt3 = new Thread(runnable);

      dt1.start();
      dt2.start();
      dt3.start();


      dt1.join();
      dt2.join();
      dt3.join();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
