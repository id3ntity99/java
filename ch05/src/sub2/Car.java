package sub2;

// Define Car class
public class Car {
  // Attributes; It is quite a good practice declaring attributes as private
  private String name;
  private String color;
  private int speed;

  // Constructor
  public Car(String name, String color, int speed) {
    this.name = name;
    this.color = color;
    this.speed = speed;
  }

  public String getName() {
    return this.name;
  }

  public String getColor() {
    return this.color;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setColor(String color) {
    this.color = color;
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
