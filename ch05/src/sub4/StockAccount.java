package sub4;

public class StockAccount extends Account {
  private String stock;
  private int amount;
  private int price;

  public StockAccount(String bank, String id, String name, int balance, String stock, int amount,
      int price) {
    super(bank, id, name, balance);
    this.stock = stock;
    this.amount = amount;
    this.price = price;
  }

  public void sell(int amount, int price) {
    this.amount -= amount;
    this.balance += amount * price;
  }

  public void buy(int amount, int price) {
    this.amount += amount;
    this.balance -= amount * price;
  }

  public void show() {
    System.out.println("Capital: " + this.bank);
    System.out.println("Account: " + this.id);
    System.out.println("Balance: " + this.balance);
    System.out.println("Stock: " + this.stock);
    System.out.println("Amount: " + this.amount);
    System.out.println("Price: " + this.price);
  }
}
