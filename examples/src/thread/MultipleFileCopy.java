package thread;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

// TODO Refactoring required for MultipleFileCopy and SingleFileCopy
public class MultipleFileCopy implements Runnable {
  private final InputStream in;
  private final OutputStream out;
  private static final int SIZE = 512;
  private static final Logger LOGGER = Logger.getLogger(Thread.currentThread().getName());

  public MultipleFileCopy(InputStream in, OutputStream out) {
    this.in = in;
    this.out = out;
  }

  // Retrieve paths of source files from a file named "sources.txt", which contains the paths
  // of source files and is located at "resources" directory
  public static List<String> getSources(String pathsFile) {
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
      LOGGER.severe(msg);
      e.printStackTrace();
    } catch (IOException e) {
      LOGGER.severe("IOException Raised...");
      e.printStackTrace();
    }
    return paths;
  }

  public static String getSourcesPath(Scanner sc) {
    return sc.nextLine().trim();
  }

  public static String getDestination(Scanner sc) {
    return sc.nextLine().trim();
  }

  @Override
  public void run() {
    try {
      while (in.available() > 0) {
        byte[] bytes = in.readNBytes(SIZE);
        out.write(bytes);
        out.flush();
      }
      in.close();
      out.close();
    } catch (IOException e) {
      LOGGER.severe(e.getMessage());
      Thread.currentThread().interrupt();
    }
  }
}
