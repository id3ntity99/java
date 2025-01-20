package sub2;

class WorkThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("WorkThread.." + i);

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("WorkThread 종료...");
  }
}


public class ThreadJoinTest {
  public static void main(String[] args) {
    WorkThread work = new WorkThread();

    // Start the WorkThread
    work.start();

    // Wait until WorkThread finishes its job
    try {
      work.join();// Main thread waits for work thread.
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("메인 스레드 종료...");
  }
}
