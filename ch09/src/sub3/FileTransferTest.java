package sub3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*-
 * 날짜: 2025/01/16
 * 이름: 이현민
 * 내용: Java input.transferTo(OuptStream out) 실습하기
 */
public class FileTransferTest {
  public static void main(String[] args) {
    String src = "C:\\Users\\lotte6\\Desktop\\sample.tif";
    String target = "C:\\Users\\lotte6\\Desktop\\sample2.tif";

    File srcFile = new File(src);
    File targetFile = new File(target);

    try (FileInputStream input = new FileInputStream(srcFile);
        FileOutputStream output = new FileOutputStream(targetFile)) {

      input.transferTo(output);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
