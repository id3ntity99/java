package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test11 {
  public static void main(String[] args) throws IOException {
    InputStreamReader in = new InputStreamReader(System.in);
    OutputStreamWriter out = new OutputStreamWriter(System.out);
    BufferedReader reader = new BufferedReader(in);
    BufferedWriter writer = new BufferedWriter(out);

    while (true) {
      String[] s = reader.readLine().split(" ");
      int x = Integer.parseInt(s[0]);
      int y = Integer.parseInt(s[1]);
      if (x == 0 && y == 0)
        break;
      writer.write(String.valueOf(x + y));
      writer.newLine();
    }
    writer.flush();
    reader.close();
    in.close();
    out.close();
  }
}
