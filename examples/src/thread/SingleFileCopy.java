package thread;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SingleFileCopy implements Runnable {
  private final InputStream in;
  private final OutputStream out;
  private static final int SIZE = 512;

  public SingleFileCopy(InputStream in, OutputStream out) {
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
