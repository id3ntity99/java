package sub1;

import java.util.logging.Level;
import java.util.logging.Logger;

/*-
 * 날짜: 2025/01/13
 * 이름: 이현민
 * 내용: Java Throw 사용자 정의 예외처리 실습하기 
 */
class MinusException extends Exception {
  public MinusException(String message) {
    super(message);
  }
}


class OverException extends Exception {
  public OverException(String message) {
    super(message);
  }
}


class Score {
  private static final Logger LOGGER = Logger.getLogger("ScoreLogger");

  public void check(int score) throws MinusException, OverException {
    if (score < 0) {
      throw new MinusException("Socre cannot be negative");
    } else if (score > 100) {
      throw new OverException("Score cannot be greater than 100");
    } else {
      LOGGER.log(Level.INFO, "Score value is good to go.");
    }
  }
}


public class ThrowTest {
  public static void main(String[] args) {
    Score score = new Score();
    try {
      score.check(-10);
    } catch (MinusException | OverException e) {
      e.printStackTrace();
    }

    try {
      score.check(100);
    } catch (MinusException | OverException e) {
      e.printStackTrace();
    }

    try {
      score.check(86);
    } catch (MinusException | OverException e) {
      e.printStackTrace();
    }
  }
}
