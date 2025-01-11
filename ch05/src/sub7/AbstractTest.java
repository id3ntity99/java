package sub7;

public class AbstractTest {
  public static void main(String[] args) {
    Animal animal1 = new Eagle();
    Animal animal2 = new Tiger();
    Animal animal3 = new Shark();

    animal1.move();
    animal1.hunt();

    animal2.move();
    animal2.hunt();

    animal3.move();
    animal3.hunt();
  }
}
