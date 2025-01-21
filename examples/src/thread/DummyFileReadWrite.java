package thread;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

public class DummyFileReadWrite implements Closeable, Runnable {
  private final InputStream in;
  private final OutputStream out;
  private static final Logger LOGGER = Logger.getLogger(Thread.currentThread().getName());

  public DummyFileReadWrite(InputStream in, OutputStream out) {
    this.in = in;
    this.out = out;
  }

  /*
   * TODO: How to run while loop in multi-threaded environment?
   */
  @Override
  public void run() {
    String message = String.format("%s is copying the srouce file into the destination.",
        Thread.currentThread().getName());
    LOGGER.info(message);
    try {
      while (in.available() > 0) {
        byte[] bytes = in.readNBytes(512);
        out.write(bytes);
        out.flush();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void close() throws IOException {
    in.close();
    out.close();
  }
}
