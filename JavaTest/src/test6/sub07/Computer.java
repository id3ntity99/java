package test6.sub07;

public class Computer extends Product {
  private String manufactor;

  public Computer(String prodId, String prodName, int price, int quantity, String manufactor) {
    super(prodId, prodName, price, quantity);
    this.manufactor = manufactor;
  }

  @Override
  public void printProductInfo() {
    super.printProductInfo();
    System.out.printf("제조사: %s%n", this.manufactor);
  }
}
