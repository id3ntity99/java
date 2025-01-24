package thread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import thread.internal.InputHelper;
import thread.task.AbstractFileCopy;

public class SingleThreadMultiFileCopyTest {
  private static final Logger LOGGER =
      Logger.getLogger(SingleThreadMultiFileCopyTest.class.getName());

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sourcesPath = InputHelper.getInput("Path to sources.txt: ", sc);
    String dest = InputHelper.getInput("Destination path: ", sc);

    try {
      List<String> sources = InputHelper.getSources(sourcesPath);

      Instant start = Instant.now();
      int i = 1;
      for (String source : sources) {
        InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(dest + "copy" + i++ + ".txt");
        AbstractFileCopy task = new MultipleFileCopy(in, out);

        task.run();

        in.close();
        out.close();
      }

      Instant finish = Instant.now();
      long timeElapsed = Duration.between(start, finish).toSeconds();
      String msg = String.format("Time Elapsed: %d", timeElapsed);
      LOGGER.info(msg);

    } catch (FileNotFoundException e) {
      String msg = String.format("File not found at %s", sourcesPath);
      LOGGER.severe(msg);
      e.printStackTrace();
    } catch (IOException e) {
      LOGGER.severe("IOExceiption raised");
      e.printStackTrace();
    }


  }
}
