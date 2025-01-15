package sub1;

public abstract class Fruit {
  protected String color;
  protected String country;
  protected int price;

  protected Fruit(String color, String country, int price) {
    this.color = color;
    this.country = country;
    this.price = price;
  }

  public String getColor() {
    return color;
  }

  public String getCountry() {
    return country;
  }

  public int getPrice() {
    return price;
  }
}
