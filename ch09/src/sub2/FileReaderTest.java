package sub2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*-
 * 날짜: 2025/01/16
 * 이름: 이현민
 * 내용: Java FileReader 실습하기
 */
public class FileReaderTest {
  public static void main(String[] args) {
    String src = "C:\\Users\\lotte6\\Desktop\\Test1.txt";
    String target = "C:\\Users\\lotte6\\Desktop\\Test2.txt";

    File srcFile = new File(src);
    File targetFile = new File(target);

    try (FileReader reader = new FileReader(srcFile);
        FileWriter writer = new FileWriter(targetFile)) {

      while (reader.ready()) {// If the input stream reader is ready, which means the buffer of the
                              // reader is not empty
        reader.transferTo(writer);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
