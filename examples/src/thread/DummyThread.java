package thread;

public class DummyThread implements Runnable {
  private static DummyFileReader reader;

  public DummyThread(DummyFileReader reader) {
    this.reader = reader;
  }

  @Override
  public void run() {
    try {
      System.out.println(Thread.currentThread().getName() + " is reading...");
      reader.read();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
