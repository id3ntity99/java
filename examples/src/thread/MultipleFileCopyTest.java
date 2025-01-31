package thread.task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import thread.MultipleFileCopy;
import thread.internal.InputHelper;

public class MultipleFileCopyTest {
  private static final Logger LOGGER = Logger.getLogger(MultipleFileCopyTest.class.getName());

  public static void main(String[] args) throws InterruptedException, IOException {
    Scanner sc = new Scanner(System.in);

    String sourcesPath = InputHelper.getInput("Path to sources.txt: ", sc);
    String dest = InputHelper.getInput("Destination path: ", sc);

    List<String> paths = InputHelper.getSources(sourcesPath);

    // Iterate the paths array and spawn new thread per path which copies source file into
    // destination
    Iterator<String> iter = paths.iterator();
    int i = 1;
    Instant start = Instant.now();

    while (iter.hasNext()) {
      String path = iter.next();
      InputStream in = new FileInputStream(path);
      OutputStream out = new FileOutputStream(dest + "copy" + i++ + ".txt");
      AbstractFileCopy copy = new MultipleFileCopy(in, out);
      Thread thread = new Thread(copy);
      thread.start();
    }

    Thread.sleep(3000);// Wait until worker threads get their jobs done

    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start, finish).toSeconds();
    String msg = String.format("Time Elapsed: %d seconds", timeElapsed);
    LOGGER.info(msg);
    sc.close();
  }
}
