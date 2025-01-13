package sub1;

public class Shark extends Animal {

  @Override
  public void move() {
    System.out.println("A shark is swiming...");
  }

  @Override
  public void hunt() {
    System.out.println("A shark is hunting...");
  }
}
