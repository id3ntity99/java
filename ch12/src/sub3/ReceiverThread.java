package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread {
  private Socket socket;

  public ReceiverThread(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      while (true) {
        String msg = reader.readLine();
        if (msg == null) {
          break;
        }
        System.out.println("Receiver: " + msg);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        socket.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
