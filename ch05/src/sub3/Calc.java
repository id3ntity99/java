package sub3;

// Use singleton pattern
public class Calc {
  private static final Calc INSTANCE_CALC = new Calc();

  private Calc() {
    // Empty constructor
  }

  public static Calc getInstance() {
    return INSTANCE_CALC;
  }

  public int add(int x, int y) {
    return x + y;
  }

  public int subtract(int x, int y) {
    return x - y;
  }

  public int multiply(int x, int y) {
    return x * y;
  }

  public int divide(int x, int y) {
    return x / y;
  }
}
