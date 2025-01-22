package sub1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/*-
 * 날짜: 2025/01/22
 * 이름: 이현민
 * 내용: Java HTTP Client 찍먹하기
 */
public class HttpClientTest {
  public static void main(String[] args) {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest req =
        HttpRequest.newBuilder().uri(URI.create("https://www.google.com")).GET().build();
    try {
      HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());
      System.out.println("Status Code = " + res.statusCode());
      System.out.println("Response Body = " + res.body());
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }
}
