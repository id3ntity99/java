package thread.task;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SingleFileCopy implements Runnable {
  private final InputStream in;
  private final OutputStream out;
  private final int size;

  public SingleFileCopy(InputStream in, OutputStream out, int size) {
    this.in = in;
    this.out = out;
    this.size = size;
  }

  @Override
  public void run() {
    try {
      byte[] bytes = in.readNBytes(size);
      out.write(bytes);
      out.flush();
    } catch (IOException e) {
      e.printStackTrace();
      Thread.currentThread().interrupt();
    }
  }
}
