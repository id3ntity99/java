package sub4.example;

public class Main {
  public static void main(String[] args) {
    // calc 변수의 타입이 RollingChecksumCalc abstract class임에 주의할 것.
    RollingChecksumCalc calc = new AdlerChecksumCalc("Wikipedia");
    int hash = calc.hash();
    System.out.println(hash);
    System.out.println(calc.toHex().toUpperCase());

  }
}
