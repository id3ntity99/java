package thread.task;

import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractFileCopy implements Runnable {
  protected InputStream in;
  protected OutputStream out;
  protected static final int SIZE = 512;

  protected AbstractFileCopy(InputStream in, OutputStream out) {
    this.in = in;
    this.out = out;
  }
}
