package sub1;

// Define Car class
public class Car {
  // Attributes
  String name;
  String color;
  int speed;

  // Constructor
  public Car() {
    // Empty Constructor
  }

  // Functions(methods)
  public void speedUp(int speed) {
    this.speed += speed; //
  }

  public void speedDown(int speed) {
    this.speed -= speed;
  }

  public void show() {
    System.out.println("Name: " + this.name);
    System.out.println("Color: " + this.color);
    System.out.println("Current Speed: " + this.speed);
  }
}
