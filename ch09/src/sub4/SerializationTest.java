package sub4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*-
 * 날짜: 2025/01/16
 * 이름: 이현민
 * 내용: Java Serialization 실습하기
 */
public class SerializationTest {
  public static void main(String[] args) {
    Apple apple = new Apple("South Korea", 3000);
    String target = "C:\\Users\\lotte6\\Desktop\\Apple.txt";

    try (FileOutputStream output = new FileOutputStream(target)) {
      ObjectOutputStream objOutput = new ObjectOutputStream(output);
      objOutput.writeObject(apple);
      objOutput.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
