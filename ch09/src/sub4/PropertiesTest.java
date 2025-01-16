package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*-
 * 날짜: 2025/01/16
 * 이름: 이현민
 * 내용: Java Properties 실습하기
 */
public class PropertiesTest {
  public static void main(String[] args) {
    Properties props = new Properties();
    props.setProperty("A", "Apple");
    props.setProperty("B", "Banana");
    props.setProperty("C", "Cherry");

    System.out.println(props);

    // Serialize props
    String target = "C:\\Users\\lotte6\\Desktop\\Fruit.properties";
    try (FileOutputStream out = new FileOutputStream(target)) {
      props.store(out, null);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }


    // Deserialize .properties file
    String src = "C:\\Users\\lotte6\\Desktop\\Nation.properties";
    Properties srcProps = new Properties();
    try (FileInputStream in = new FileInputStream(src)) {
      srcProps.load(in); // Load properties from source URI
      System.out.println(srcProps.getProperty("kor"));
      System.out.println(srcProps.getProperty("usa"));
      System.out.println(srcProps.getProperty("jpn"));

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
