package thread;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.logging.Logger;
import thread.task.AbstractFileCopy;

public class MultipleFileCopy extends AbstractFileCopy implements Callable<Integer> {
  private static final Logger LOGGER = Logger.getLogger(Thread.currentThread().getName());

  public MultipleFileCopy(InputStream in, OutputStream out) {
    super(in, out);
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

  @Override
  public Integer call() throws Exception {
    int available = 0;
    try {
      while (in.available() > 0) {
        byte[] buf = in.readNBytes(SIZE);
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
