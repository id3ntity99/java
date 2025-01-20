package thread;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DummyFileReadWrite implements Closeable, Runnable {
  private final FileInputStream fileIn;
  private final FileOutputStream fileOut;

  public DummyFileReadWrite(FileInputStream in, FileOutputStream out) {
    this.fileIn = in;
    this.fileOut = out;
  }

  /*
   * TODO: How to run while loop in multi-threaded environment?
   */
  @Override
  public void run() {
    System.out.println(
        Thread.currentThread().getName() + " is copying the source file into the dest file...");
    try {
      while (fileIn.available() > 0) {
        byte[] bytes = fileIn.readNBytes(512);
        fileOut.write(bytes);
        fileOut.flush();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void close() throws IOException {
    fileIn.close();
    fileOut.close();
  }
}
