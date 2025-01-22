package thread;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
