package test6.sub07;

public class Product {
  protected String prodId;
  protected String prodName;
  protected int price;
  protected int quantity;

  public Product(String prodId, String prodName, int price, int quantity) {
    this.prodId = prodId;
    this.prodName = prodName;
    this.price = price;
    this.quantity = quantity;
  }

  public void printProductInfo() {
    System.out.printf("상품코드: %s\n상품이름: %s\n상품가격: %d\n재고수량: %d\n", prodId, prodName, price,
        quantity);
  }
}
