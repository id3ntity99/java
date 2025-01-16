package sub4;

import java.io.Serializable;

public class Apple implements Serializable {
  private String country;
  private int price;

  public Apple(String country, int price) {
    this.country = country;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Apple [country=" + country + " , price=" + price + "]";
  }

  public void show() {
    System.out.println(this.toString());
  }
}
