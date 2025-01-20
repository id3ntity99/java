package sub4.example;

import java.nio.charset.StandardCharsets;

/**
 * @author id3ntity99</br>
 *         Java 추상화 예제 코드 작성. Checksum 계산기의 추상 클래스.
 * 
 */
public abstract class RollingChecksumCalc {
  protected String input;
  protected int hash;

  protected RollingChecksumCalc(String input) {
    this.input = input;
  }

  /**
   * 체크섬(해시)를 계산하는 메서드. 해시를 계산하는 방법은 알고리즘 마다 다르므로 abstract 키워드를 이용해 추상 메서드로 선언한다.<br>
   * 최종 유저는 getHash()를 사용하여 계산이 끝난 해시값을 전달받으면 되기 때문에, protected 접근 지시자를 사용하여 사용자에게 <br>
   * 노출하는 정보를 최소화하고, encapsulation을 확보한다.<br>
   * 이 메서드는 추상 메서드이므로, 본 클래스를 상속하는 모든 자식 클래스들은 필수적으로 이 메서드를 구현해야만 하는 contract가 성립된다.
   * 
   * @param buffer ASCII 바이트 스트림
   * @return 계산이 끝난 해시값
   */
  protected abstract int calcChecksum(byte[] buffer);

  /**
   * 계산이 끝난 최종 해시값을 유저에게 전달해주는 메서드. <br>
   * 유저는 이 클래스를 이용하여 해시값을 계산하고자 할 것이므로, public 접근 지시자를 사용한다.
   * 
   * @return
   */
  public int hash() {
    this.hash = calcChecksum(input.getBytes(StandardCharsets.US_ASCII));
    return this.hash;
  };

  public String toHex() {
    return "0x" + Integer.toHexString(hash);
  }
}
