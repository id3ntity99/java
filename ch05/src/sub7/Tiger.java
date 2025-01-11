package sub7;

public class Tiger extends Animal {

  @Override
  public void move() {// Implement super.move() method.
    System.out.println("A tiger is running..");
  }

  @Override
  public void hunt() {
    System.out.println("A tiger is hunting...");
  }
}
