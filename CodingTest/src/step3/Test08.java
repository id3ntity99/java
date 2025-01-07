package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test08 {
  public static void main(String[] args) throws IOException {
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);
    OutputStreamWriter out = new OutputStreamWriter(System.out);
    BufferedWriter bw = new BufferedWriter(out);
    int t = Integer.parseInt(br.readLine());

    // Get inputs and do calculation
    for (int i = 0; i < t; i++) {
      String s = br.readLine();
      int x = Integer.parseInt(s.split(" ")[0]);
      int y = Integer.parseInt(s.split(" ")[1]);
      String res = String.format("Case #%d: %d + %d = %d", i + 1, x, y, x + y);
      bw.write(res);
      bw.newLine();
    }
    bw.flush();
  }
}
