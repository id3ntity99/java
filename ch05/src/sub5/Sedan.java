package sub5;

public class Sedan extends Car {
  private final int MAX_SPEED = 180;
  private int cc;

  public Sedan(String name, String color, int speed, int cc) {
    super(name, color, speed);
    this.cc = cc;
  }

  public void turbo() {
    this.speed += 20;
  }

  @Override
  public void speedUp(int speed) {
    // Modify this method for Sedan.class
    super.speedUp(speed);

    if (this.speed > MAX_SPEED) {
      this.speed = MAX_SPEED;
    }
  }

  @Override
  public void show() {
    super.show();
    System.out.println("CC: " + this.cc);
  }
}
