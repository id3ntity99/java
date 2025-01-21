package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MultipleFileCopyTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Source file paths separated by comma: ");
    String pathString = sc.nextLine();
    List<String> paths = null;

    if (pathString.contains(",")) { // split the path string input by comma(,)
      paths = Arrays.asList(pathString.split(","));
    } else {
      paths = new ArrayList<>();
      paths.add(pathString.trim());
    }

    // TODO: trim every path of the list
    paths.stream().forEach(null);


    paths.stream().forEach(System.out::println);


    // TODO: Iterate the paths array and spawn new thread per path which copies source file into
    // destination

    sc.close();
  }
}
