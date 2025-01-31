package thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import thread.internal.InputHelper;
import thread.task.MultipleFileCopy;

public class MultiFileCopyWithThreadPoolTest {
  private static final Logger LOGGER =
      Logger.getLogger(MultiFileCopyWithThreadPoolTest.class.getName());

  public static void main(String[] args)
      throws IOException, InterruptedException, ExecutionException {
    ExecutorService pool = Executors.newFixedThreadPool(5);
    Scanner sc = new Scanner(System.in);

    String sourcesPath = InputHelper.getInput("Path to sources.txt: ", sc) + "/sources.txt";
    String dest = InputHelper.getInput("Path to destination: ", sc);

    List<String> paths = InputHelper.getSources(sourcesPath);

    // iterate & start tasks
    int counter = 1;
    List<Callable<Integer>> tasks = new ArrayList<>();
    for (String path : paths) {
      InputStream in = new FileInputStream(path);
      OutputStream out = new FileOutputStream(dest + "/copy" + counter++ + ".txt");
      Callable<Integer> task = new MultipleFileCopy(in, out, 8192);
      tasks.add(task);
    }

    List<Future<Integer>> results = pool.invokeAll(tasks);

    Instant start = Instant.now();

    while (true) {
      if (results.getLast().isDone()) {
        for (Future<Integer> result : results) {
          String msg = String.format("State = %s%nAvailable Bytes in InputStream = %d%n",
              result.state(), result.get());
          LOGGER.info(msg);
        }
        break;
      }
    }


    pool.awaitTermination(5, TimeUnit.SECONDS);
    pool.close();
    sc.close();

    Instant finish = Instant.now();
    long duration = Duration.between(start, finish).toSeconds();
    String msg = String.format("Time Elapsed = %d\n", duration);

    LOGGER.info(msg);
  }
}
