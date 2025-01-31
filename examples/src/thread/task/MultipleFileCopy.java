package thread.task;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

public class MultipleFileCopy implements Runnable, Callable<Integer> {
  private static final Logger LOGGER = Logger.getLogger(Thread.currentThread().getName());
  private final InputStream in;
  private final OutputStream out;
  private final int size;

  public MultipleFileCopy(InputStream in, OutputStream out, int size) {
    this.in = in;
    this.out = out;
    this.size = size;
  }

  @Override
  public void run() {
    try {
      while (in.available() > 0) {
        byte[] bytes = in.readNBytes(size);
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

  @Override
  public Integer call() throws Exception {
    int available = 0;
    try {
      while (in.available() > 0) {
        byte[] buf = in.readNBytes(size);
        out.write(buf);
        out.flush();
      }
      available = in.available();
      in.close();
      out.close();
    } catch (IOException e) {
      LOGGER.severe(e.getMessage());
      Thread.currentThread().interrupt();
    }
    return available;
  }
}
