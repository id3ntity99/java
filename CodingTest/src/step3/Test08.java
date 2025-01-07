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

    for (int i = 0; i < t; i++) {
      String s = br.readLine();
      int x = Integer.parseInt(s.split(" ")[0]);
      int y = Integer.parseInt(s.split(" ")[1]);
      bw.write(String.valueOf(x + y));
      bw.newLine();
    }
    br.reset();

    for (int j = 0; j < t; j++) {
      String s = br.readLine();
      int x = Integer.parseInt(s.split(" ")[0]);
      int y = Integer.parseInt(s.split(" ")[1]);
    }
  }
}
