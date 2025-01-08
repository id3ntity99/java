package sub3;

public class Car {
  private String name;
  private String color;
  private int speed;
  public static int count; // Class variable(Static variable)

  public Car(String name, String color, int speed) {
    this.name = name;
    this.color = color;
    this.speed = speed;
    count++;
  }

  public String getName() {
    return this.name;
  }

  public String getColor() {
    return this.color;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public static int getCount() {
    return count;
  }

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
