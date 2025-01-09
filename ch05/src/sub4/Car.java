package sub4;

public class Car {
  // protected access modifier는 같은 패키지의 다른 클래스 + 자식 클래스에서만 접근 가능
  protected String name;
  protected String color;
  protected int speed;

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

  public void setName(String name) {
    this.name = name;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void speedUp(int speed) {
    this.speed += speed;
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
