package sub2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
  public static void main(String[] args) {
    System.out.println("[Server]");

    ServerSocket serverSock = null;
    try {
      serverSock = new ServerSocket();
      serverSock.bind(new InetSocketAddress("localhost", 5001));

      System.out.println("연결 대기...");

      Socket sock = serverSock.accept();
      System.out.println("연결 수립...");

      InputStream in = sock.getInputStream();
      byte[] bytes = new byte[100];
      int readBytes = in.read(bytes);

      String result = new String(bytes, 0, readBytes, "UTF-8");
      System.out.println(result);
      System.out.println("데이터 수신 완료");


      OutputStream out = sock.getOutputStream();
      String msg = "hello server!";

      byte[] msgBytes = msg.getBytes();
      out.write(msgBytes);
      out.flush();
      System.out.println("데이터 송신 완료...");

      sock.close();
      serverSock.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Server 종료...");
  }
}
