package sub5;

import java.io.File;
import java.io.IOException;

/*-
 * 날짜: 2025/01/16
 * 이름: 이현민
 * 내용: Java File 실습하기
 */
public class FileTest {
  public static void main(String[] args) {
    String path = "C:\\Users\\lotte6\\Desktop\\Test.txt";
    String dirPath = "C:\\Users\\lotte6\\Desktop\\Test";

    File testFile = new File(path);
    File testDir = new File(dirPath);

    try {
      boolean isSuccess = testFile.createNewFile();
      if (!isSuccess)
        throw new IOException("Creation of new file failed at: " + path);
      testDir.mkdir();

      System.out.println(testFile.exists());
      System.out.println(testFile.isFile());
      System.out.println(testFile.getName());
      System.out.println(testFile.getPath());
      System.out.println(testFile.getAbsolutePath());
      System.out.println(testDir.exists());
      System.out.println(testDir.isDirectory());
      System.out.println(testDir.getName());
      System.out.println(testDir.getPath());
      System.out.println(testDir.getAbsolutePath());

      testFile.delete();
      testDir.delete();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
