package sub4;

public class Sedan extends Car {
  private int cc;

  public Sedan(String name, String color, int speed, int cc) {
    super(name, color, speed);
    this.cc = cc;
  }

  public void turbo() {
    this.speed += 20;
  }

  @Override
  public void show() {
    super.show();
    System.out.println("CC: " + this.cc);
  }
}
