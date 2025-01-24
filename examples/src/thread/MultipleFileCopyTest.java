package thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

// TODO Measure performance of copying multiple files with multiple threads.
public class MultipleFileCopyTest {
  private static final Logger LOGGER = Logger.getLogger(MultipleFileCopyTest.class.getName());

  public static void main(String[] args) throws InterruptedException, IOException {
    Scanner sc = new Scanner(System.in);

    System.out.print("Path to sources.txt: ");
    String sourcesPath = MultipleFileCopy.getSourcesPath(sc);

    List<String> paths = MultipleFileCopy.getSources(sourcesPath);

    System.out.print("Destination path: ");
    String dest = MultipleFileCopy.getDestination(sc);

    // Iterate the paths array and spawn new thread per path which copies source file into
    // destination
    Iterator<String> iter = paths.iterator();
    int i = 1;
    while (iter.hasNext()) {
      String path = iter.next();
      InputStream in = new FileInputStream(path);
      OutputStream out = new FileOutputStream(dest + "\\copy" + i++ + ".txt");
      Runnable copy = new MultipleFileCopy(in, out);
      Thread thread = new Thread(copy);
      thread.start();
      thread.join();
    }

    sc.close();
  }
}
