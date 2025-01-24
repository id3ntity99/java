package thread;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

// TODO Measure performance of copying multiple files with multiple threads.
public class MultipleFileCopyTest {
  private static Logger LOGGER = Logger.getLogger(MultipleFileCopyTest.class.getName());

  // Retrieve paths of source files from a file named "sources.txt", which contains the paths
  // of source files and is located at "resources" directory
  private static List<String> getSources(String pathsFile) {
    List<String> paths = new ArrayList<>();

    try (InputStreamReader inReader = new InputStreamReader(new FileInputStream(pathsFile));
        BufferedReader reader = new BufferedReader(inReader)) {
      while (reader.ready()) {
        String path = reader.readLine().trim();
        paths.add(path);
      }
    } catch (FileNotFoundException e) {
      String msg = String.format("Exception Raised: %s%nFile not found for %s...%n", e.getMessage(),
          pathsFile);
      LOGGER.warning(msg);
      e.printStackTrace();
    } catch (IOException e) {
      LOGGER.severe("IOException Raised...");
      e.printStackTrace();
    }
    return paths;
  }

  private static String getDestination(Scanner sc) {
    System.out.print("Destination path: ");
    String dest = sc.nextLine();
    return dest;
  }

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.print("Path to sources.txt: ");
    String sourcesPath = sc.nextLine().trim();

    List<String> paths = getSources(sourcesPath);

    String dest = getDestination(sc);

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
