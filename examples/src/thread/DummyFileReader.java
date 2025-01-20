package thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DummyFileReader implements Closeable {
  private FileInputStream fileIn;
  private InputStreamReader in;
  private FileOutputStream fileOut;
  private OutputStreamWriter out;
  private BufferedReader reader;
  private BufferedWriter writer;

  public DummyFileReader(File source, File dest) throws Exception {
    fileIn = new FileInputStream(source);
    in = new InputStreamReader(fileIn);
    fileOut = new FileOutputStream(dest);
    out = new OutputStreamWriter(fileOut);
    reader = new BufferedReader(in);
    writer = new BufferedWriter(out);
  }

  public void read() throws IOException {
    char[] buf = new char[512];
    reader.read(buf);
    writer.write(buf);
    writer.flush();
  }

  @Override
  public void close() throws IOException {
    fileIn.close();
    in.close();
    fileOut.close();
    out.close();
    reader.close();
    writer.close();
  }
}
