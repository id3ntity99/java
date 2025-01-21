package thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MultipleFileCopyTest {
  // Get destination from user
  private static List<String> getSources(Scanner sc) {
    System.out.print("Source file paths separated by comma: ");
    String pathString = sc.nextLine();
    List<String> paths = null;

    if (pathString.contains(",")) { // split the path string input by comma(,)
      paths = Arrays.asList(pathString.split(","));
    } else {
      paths = new ArrayList<>();
      paths.add(pathString.trim());
    }
    return paths;
  }

  private static String getDestination(Scanner sc) {
    System.out.println("Destination path: ");
    String dest = sc.nextLine();
    return dest;
  }

  private static void trimPaths(List<String> paths) {
    // Trim every path of the list
    for (int i = 0; i < paths.size(); i++) {
      String trimmed = paths.get(i).trim();
      paths.set(i, trimmed);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    List<String> paths = getSources(sc);

    String dest = getDestination(sc);

    trimPaths(paths);

    // TODO: Iterate the paths array and spawn new thread per path which copies source file into
    // destination
    Iterator<String> iter = paths.iterator();
    int i = 1;
    while (iter.hasNext()) {
      String path = iter.next();
      InputStream in = new FileInputStream(path);
      OutputStream out = new FileOutputStream(dest + "\\copy" + i++ + ".txt");
      Runnable copy = new SingleFileCopy(in, out);
      Thread thread = new Thread(copy);
      thread.start();
    }

    sc.close();
  }
}
