package sub3;

public class Increment {
  private int x;
  private static int y;

  public Increment() {
    x++;
    y++;
    System.out.println("X = " + x);
    System.out.println("Y = " + y);
  }
}
