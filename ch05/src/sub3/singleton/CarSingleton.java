package sub3.singleton;

public class CarSingleton {
  private static CarSingleton instance;
  private String name;
  private String color;
  private int doors;

  private CarSingleton(String name, String color, int doors) {
    this.name = name;
    this.color = color;
    this.doors = doors;
  }

  public static CarSingleton getInstance(String name, String color, int doors) {
    if (instance == null)
      instance = new CarSingleton(name, color, doors);
    return instance;
  }

  public String getName() {
    return this.name;
  }
}
