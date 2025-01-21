package thread;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

public class DummyFileReadWrite implements Runnable {
  private final InputStream in;
  private final OutputStream out;
  private static final Logger LOGGER = Logger.getLogger(Thread.currentThread().getName());
  private static final int SIZE = 512;

  public DummyFileReadWrite(InputStream in, OutputStream out) {
    this.in = in;
    this.out = out;
  }

  @Override
  public void run() {
    try {
      byte[] bytes = in.readNBytes(SIZE);
      out.write(bytes);
      out.flush();
    } catch (IOException e) {
      e.printStackTrace();
      Thread.currentThread().interrupt();
    }
  }
}
