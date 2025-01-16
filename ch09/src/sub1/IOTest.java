package sub1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*-
 * 날짜: 2025/01/16
 * 이름: 이현민
 * 내용: Java 파일 입출력 스트림 실습하기
 */
public class IOTest {
  public static void main(String[] args) {
    String src = "C:\\Users\\lotte6\\Desktop\\Test1.txt";
    String target = "C:\\Users\\lotte6\\Desktop\\Test2.txt";

    File srcFile = new File(src);
    File targetFile = new File(target);

    try (FileInputStream input = new FileInputStream(srcFile);
        FileOutputStream output = new FileOutputStream(targetFile)) {// Use try-with statement with
                                                                     // multiple resources.
      input.transferTo(output);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
