package test6.sub02;

public class Product {
  private String productId;
  private String productName;
  private int price;
  private int quantity;

  public Product(String productId, String productName, int price, int quantity) {
    this.productId = productId;
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
  }

  public void updatePrice(int price) {
    this.price = price;
    System.out.printf("%s 가격 수정됨\n", productName);
  }

  public void addStock(int quantity) {
    this.quantity += quantity;
    System.out.println("재고 " + quantity + "개 추가");
  }

  public void printProductInfo() {
    System.out.printf("상품 ID: %s\n상품이름:%s\n상품가격: %d\n재고수량:%d\n", productId, productName, price,
        quantity);
  }
}
