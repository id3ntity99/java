package sub4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*-
 * 날짜: 2025/01/20
 * 이름: 이현민
 * 내용: Java 스레드풀 실습하기
 */
class Task implements Runnable {
  private String name;

  public Task(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " - " + name);
    try {
      Thread.sleep(1000);
    } catch (

    InterruptedException e) {
      e.printStackTrace();
    }
  }
}


public class ThreadPoolTest {
  public static void main(String[] args) {

    // The number of threads in the pool affects performance
    try (ExecutorService exec = Executors.newFixedThreadPool(10)) {// Create Thread Pool
      // Submit the Task to the thread pool
      for (int i = 1; i <= 10; i++) {
        exec.submit(new Task("Task " + i));
      }

      // Shutdown thread pool
      exec.shutdown();

    }

    System.out.println("프로그램 종료...");
  }
}
