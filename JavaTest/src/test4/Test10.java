package test4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test10 {
  public static void main(String[] args) {
    String path = "C:\\Users\\lotte6\\Desktop\\Gugudan.txt";

    try {
      File file = new File(path);
      FileWriter writer = new FileWriter(file);

      for (int i = 2; i <= 9; i++) {
        String s = String.format("%d단%n", i);
        writer.write(s);
        for (int j = 1; j < 10; j++) {
          int res = i * j;
          String str = String.format("%d x %d = %d%n", i, j, res);
          writer.write(str);
        }
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("구구단 파일생성 완료....");
  }
}
