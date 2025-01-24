package thread;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import thread.task.AbstractFileCopy;

public class MultipleFileCopy extends AbstractFileCopy {
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
}
