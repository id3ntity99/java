package entity;

public class Order {
  private int orderNo;
  private String orderId;
  private int orderProduct;
  private int orderCount;
  private String orderDate;

  private String prodName;
  private int price;
  private int total;

  public Order() {}

  public Order(int orderNo, String orderId, int orderProduct, int orderCount, String orderDate) {
    this.orderNo = orderNo;
    this.orderId = orderId;
    this.orderProduct = orderProduct;
    this.orderCount = orderCount;
    this.orderDate = orderDate;
  }

  public Order(String orderId, int orderProduct, int orderCount) {
    this.orderId = orderId;
    this.orderProduct = orderProduct;
    this.orderCount = orderCount;
  }

  public int getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(int orderNo) {
    this.orderNo = orderNo;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public int getOrderProduct() {
    return orderProduct;
  }

  public void setOrderProduct(int orderProduct) {
    this.orderProduct = orderProduct;
  }

  public int getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(int orderCount) {
    this.orderCount = orderCount;
  }

  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  public String getProdName() {
    return prodName;
  }

  public void setProdName(String prodName) {
    this.prodName = prodName;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public void showOrder() {
    String msg = String.format("주문 번호: %d%n주문자 ID: %s%n주문 제품: %d%n주문 수량: %d%n주문 날짜: %s%n",
        this.getOrderNo(), this.orderId, this.orderProduct, this.orderCount, this.orderDate);
    System.out.println(msg);
  }

  @Override
  public String toString() {
    return "Order [orderNo=" + orderNo + ", orderId=" + orderId + ", orderProduct=" + orderProduct
        + ", orderCount=" + orderCount + ", orderDate=" + orderDate + "]";
  };


}
