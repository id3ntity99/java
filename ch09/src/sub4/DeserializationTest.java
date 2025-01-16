package sub4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*-
 * 날짜: 2025/01/16
 * 이름: 이현민
 * 내용: Java Deserialization 실습하기
 */
public class DeserializationTest {
  public static void main(String[] args) {
    String src = "C:\\Users\\lotte6\\Desktop\\Apple.txt";

    try (FileInputStream input = new FileInputStream(src)) {
      ObjectInputStream objInput = new ObjectInputStream(input);

      Object obj = objInput.readObject();
      Apple apple = null;

      if (obj instanceof Apple) {
        apple = (Apple) obj;
        apple.show();
      }
      
      objInput.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
