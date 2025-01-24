package thread.task;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SingleFileCopy extends AbstractFileCopy {
  public SingleFileCopy(InputStream in, OutputStream out) {
    super(in, out);
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
