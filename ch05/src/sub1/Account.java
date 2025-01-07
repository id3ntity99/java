package sub1;

// Define Account class
public class Account {
  // Attributes
  String bank;
  String id;
  String name;
  int balance;

  // Methods
  public void deposit(int amount) {
    this.balance += amount;
  }

  public void withdraw(int amount) {
    this.balance -= amount;
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
