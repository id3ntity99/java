package sub4.example;

public class RabinFingerprintCalc extends RollingChecksumCalc {
  private static final int PRIME_NUM = 101;

  public RabinFingerprintCalc(String input) {
    super(input);
  }

  private int getRandomPrime() {
    int r = (int) Math.floor(Math.log(Integer.MAX_VALUE) / Math.log(2)) + 1;
    return 0;
  }

  @Override
  protected int calcChecksum(byte[] buffer) {
    for (int i = 0; i < buffer.length; i++) {

    }
    return 0;
  }
}
