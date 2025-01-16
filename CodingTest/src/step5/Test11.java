package step5;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/*-
 * BOJ 11718
 */
public class Test11 {
  public static void main(String[] args) throws IOException {
    BufferedInputStream bf = new BufferedInputStream(System.in);

    BufferedReader reader = new BufferedReader(new InputStreamReader(bf, StandardCharsets.UTF_8));

    String line;
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
    }
    reader.close();
  }
}
