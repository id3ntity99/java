package oop;

public class AdlerChecksumCalc extends RollingChecksumCalc {
  public AdlerChecksumCalc(String input) {
    super(input);
  }

  private int concat(short a, short b) {
    return (b << 16) | a;
  }

  /**
   * This method implements adler-32 rolling hash algorithm.
   * 
   * @param buffer String that was converted into ASCII-encoded bytes
   * @return adler-32 hash
   */
  @Override
  protected int calcChecksum(byte[] buffer) {
    short a = 1;
    short b = 0;
    final int primeNum = 65521;
    for (int i = 0; i < buffer.length; i++) {
      a += buffer[i];
      b += a;
    }
    a %= primeNum;
    b %= primeNum;
    int adler32 = concat(a, b);
    return adler32;
  }
}
