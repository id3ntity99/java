package sub3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*-
 * 날짜: 2025/01/16
 * 이름: 이현민
 * 내용: Java BuffredInpuStream 실습하기
 */
public class BufferIOTest {
  public static void main(String[] args) {
    String src = "C:\\Users\\lotte6\\Desktop\\sample.tif";
    String target = "C:\\Users\\lotte6\\Desktop\\sample2.tif";

    File srcFile = new File(src);
    File targetFile = new File(target);

    try (FileInputStream input = new FileInputStream(srcFile);
        FileOutputStream output = new FileOutputStream(targetFile)) {
      BufferedInputStream bInput = new BufferedInputStream(input);
      BufferedOutputStream bOutput = new BufferedOutputStream(output);

      bInput.transferTo(bOutput);

      bOutput.flush();
      bInput.close();
      bOutput.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
