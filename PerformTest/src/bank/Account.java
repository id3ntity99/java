package bank;

/*-
 * 날짜: 2025/01/24
 * 이름: 이현민
 * 내용: Java 수행평가 + 수행평가보고서(ppt) 작성
 */
public class Account {
  private String ano;
  private String owner;
  private int balance;

  public Account(String ano, String owner, int balance) {
    this.ano = ano;
    this.owner = owner;
    this.balance = balance;
  }

  public String getAno() {
    return ano;
  }

  public String getOwner() {
    return owner;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }
}
