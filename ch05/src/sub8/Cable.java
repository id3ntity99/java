package sub8;

public class Cable implements Socket {
  private Bulb bulb;

  public Cable(Bulb bulb) {
    this.bulb = bulb; // Association. An instance of Bulb is created outside of the Cable class, and
                      // then is injected in to this class.
  }

  @Override
  public void switchOn() {
    bulb.turnOn();
  }

  @Override
  public void switchOff() {
    bulb.turnOff();
  }
}
