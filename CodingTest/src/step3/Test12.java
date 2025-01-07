package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test12 {
  public static void main(String[] args) throws IOException {
    InputStreamReader in = new InputStreamReader(System.in);
    OutputStreamWriter out = new OutputStreamWriter(System.out);
    BufferedReader reader = new BufferedReader(in);
    BufferedWriter writer = new BufferedWriter(out);

    while (true) {
      String s = reader.readLine();
      if (s == null)
        break;
      String[] numbers = s.split(" ");
      int x = Integer.parseInt(numbers[0]);
      int y = Integer.parseInt(numbers[1]);
      writer.write(String.valueOf(x + y));
      writer.newLine();
    }
    writer.flush();
    reader.close();
    writer.close();
  }
}
