package sub2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/*-
 * 날짜: 2025/01/22
 * 이름: 이현민
 * 내용: Java Socket Programming 실습하기 
 */
public class ScoketClient {
  public static void main(String[] args) {
    System.out.println("[Client]");

    Socket socket = null;


    try {
      socket = new Socket();

      System.out.println("연결 요청...");
      socket.connect(new InetSocketAddress("localhost", 5001));
      System.out.println("연결 성공...");

      OutputStream out = socket.getOutputStream();
      String msg = "hello server!";

      byte[] msgBytes = msg.getBytes();
      out.write(msgBytes);
      out.flush();
      System.out.println("데이터 송신 완료...");

      InputStream in = socket.getInputStream();
      byte[] bytes = new byte[100];
      int readBytes = in.read(bytes);

      String result = new String(bytes, 0, readBytes, "UTF-8");
      System.out.println(result);
      System.out.println("데이터 수신 완료");
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Client 종료...");
  }
}
