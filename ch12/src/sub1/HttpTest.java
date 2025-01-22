package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*-
 * 날짜: 2025/01/22
 * 이름: 이현민
 * 내용: Java HTTP 통신 찍먹하기
 */
public class HttpTest {
  public static void main(String[] args) {
    FileOutputStream out = null;
    BufferedReader reader = null;

    try {
      URL url = new URL("https://google.com");
      reader = new BufferedReader(new InputStreamReader(url.openStream()));
      out = new FileOutputStream("./result.txt");

      String line = null;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
        out.write(line.getBytes());
      }
      reader.close();
      out.close();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("HTTP 통신 종료....");
  }
}
