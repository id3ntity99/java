package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test06 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = Integer.parseInt(reader.readLine());

    for (int i = 0; i < t; i++) {
      // Format input string into two separated integers
      String inStr = reader.readLine();
      String[] splitedString = inStr.split(" ");
      int x = Integer.parseInt(splitedString[0]);
      int y = Integer.parseInt(splitedString[1]);
      writer.write(String.valueOf(x + y));
      writer.newLine();
    }

    writer.flush();
  }
}
