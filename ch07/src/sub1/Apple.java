package sub1;

public class Apple {// Implicitly extends java.Object
  private String country;
  private int price;

  public Apple(String country, int price) {
    this.country = country;
    this.price = price;
  }

  @Override
  public String toString() {

    return "Country = " + country + " , Price = " + price;
  }
}
