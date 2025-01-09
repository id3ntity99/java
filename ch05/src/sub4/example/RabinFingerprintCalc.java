package sub4.example;

public class RabinFingerprintCalc extends RollingChecksumCalc {
  public RabinFingerprintCalc(String input) {
    super(input);
  }

  @Override
  protected int calcChecksum(byte[] buffer) {
    return 0;
  }
}
