package thread;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputHelper {
  // Retrieve paths of source files from a file named "sources.txt", which contains the paths
  // of source files and is located at "resources" directory
  public static List<String> getSources(String pathsFile) throws IOException {
    List<String> paths = new ArrayList<>();

    InputStreamReader inReader = new InputStreamReader(new FileInputStream(pathsFile));
    BufferedReader reader = new BufferedReader(inReader);
    while (reader.ready()) {
      String path = reader.readLine().trim();
      paths.add(path);
    }
    reader.close();
    return paths;
  }

  public static String getInput(Scanner sc) {
    return sc.nextLine().trim();
  }
}
