package sub7;

import java.util.regex.Pattern;

public class RegExTest {
  public static void main(String[] args) {
    String pattern = "a[a-z]*"; // a[a-z]* means the pattern starts with 'a' and there are
                                // following characters that contains more than one character
                                // from a to b

    boolean r1 = Pattern.matches(pattern, "apple");
    boolean r2 = Pattern.matches(pattern, "banana");

    System.out.println(r1);
    System.out.println(r2);

    String[] patterns = {"[0-9]+", // 숫자 1개 이상
        "1[0-9]*", // 1로 시작하는 숫자 0개 이상
        "^[0-9]", // 숫자로 시작하는 문자
        "[^0-9]", // 숫자가 아닌 문자
        ".", // 문자 1개
        "[a-z]?", // 영어 소문자 1개
        "[a-z]*", // 영어 소문자 0개 이상
        "[a-z]+", // 영어 소문자 1개 이상
        "[A-Z]*", // 영어 대문자 0개 이상
        "[가-힣]+", // 한글 1자 이상
        "^[0-9a-z]*", // 숫자+영어 조합 0개 이상
        "^[0-9가-힣]*", // 숫자+한글 조합 0개 이상
        "^[A-Z][a-z]*", // 영어 대문자로 시작하는 문자 0개 이상
        "\\s", // 공백
        "\\S", // 공백이 아닌 문자
        "\\d", // 숫자
        "\\w", // 숫자와 문자
        "\\W", // 특수문자
    };

    String[] words =
        {"apple", "123abc", "123456", "011한글", "hello", "홍길동", "1", "Banana", "APPLE", "#"};

    // Check matchings for every word for every pattern
    for (String word : words) {
      for (String patt : patterns) {
        System.out.printf("For a word \"%s\" : %b\n", word, patt);
      }
    }

  }
}
