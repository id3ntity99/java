package sub2;

// Define Account class
public class Account {
  // Attributes
  private String bank;
  private String id;
  private String name;
  private int balance;

  public Account() {
    // Empty constructor. Use setter
  }

  // Methods
  public void deposit(int amount) {
    this.balance += amount;
  }

  public void withdraw(int amount) {
    this.balance -= amount;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void print() {
    System.out.println("========================");
    System.out.println("Bank: " + this.bank);
    System.out.println("Account No.: " + this.id);
    System.out.println("Name: " + this.name);
    System.out.println("Balance: " + balance);
    System.out.println("========================");
  }
}
