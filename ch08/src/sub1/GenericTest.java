package sub1;

public class GenericTest {
  public static void main(String[] args) {
    FruitBox<Apple> appleBox = new FruitBox<Apple>();
    FruitBox<Banana> bananaBox = new FruitBox<Banana>();
    Apple apple = new Apple("South Korea", 2000);
    Banana banana = new Banana("Japan", 3000);

    appleBox.setFruit(apple);

    System.out.println(appleBox.getFruit());
  }
}
