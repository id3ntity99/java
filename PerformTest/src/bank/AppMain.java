package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {
  private static Scanner scanner = new Scanner(System.in);
  private static List<Account> accounts = new ArrayList<>();


  public static void createAccount() {
    System.out.println("-------------------계좌생성-------------------");
    // Getting user's inputs for Account.ano, Account.owner, Account.balance
    System.out.print("계좌번호: ");
    String ano = scanner.nextLine();
    System.out.print("계좌주: ");
    String owner = scanner.nextLine();
    System.out.print("초기입금액: ");
    int balance = Integer.parseInt(scanner.nextLine());

    // Create an instance of Account class and add it into the list of Account objects.
    Account account = new Account(ano, owner, balance);
    accounts.add(account);

    System.out.println("계좌가 생성되었습니다.");
  }

  public static void accountList() {
    System.out.println("-------------------계좌목록-------------------");
    for (Account account : accounts) { // Iterate list of Account and print out attributes.
      System.out.print(account.getAno() + " ");
      System.out.print(account.getOwner() + " ");
      System.out.print(account.getBalance());
      System.out.println();
    }
  }

  public static void deposit() {
    System.out.println("--------------------예금--------------------");

    System.out.print("계좌번호: ");
    String targetAno = scanner.nextLine();
    Account targetAcc = findAccount(targetAno);

    System.out.print("예금액: ");
    int deposit = Integer.parseInt(scanner.nextLine());
    int currentBal = targetAcc.getBalance();// Getting a current value of target account's balance
    targetAcc.setBalance(currentBal + deposit);// Increment current balance by value given by user

    System.out.println("예금이 성공되었습니다.");
  }

  public static void withdraw() {
    System.out.println("--------------------출금--------------------");
    System.out.print("계좌번호: ");
    String targetAno = scanner.nextLine();

    Account targetAcc = findAccount(targetAno);

    System.out.print("출금액: ");
    int withdrawl = Integer.parseInt(scanner.nextLine());
    int currentBal = targetAcc.getBalance();// Getting a current value of target account's balance
    targetAcc.setBalance(currentBal - withdrawl);// Decrement current balance by value given by user

    System.out.println("출금이 성공되었습니다.");
  }

  public static Account findAccount(String ano) {
    Account targetAcc = null;
    for (Account acc : accounts) {// Iterate list of Accounts
      if (acc.getAno().equals(ano)) {// If the target accoutn number given by user is found
        targetAcc = acc;
        break; // Stop iteration
      }
    }
    return targetAcc;
  }

  public static void main(String[] args) {
    boolean isRunning = true;

    while (isRunning) {
      System.out.println("--------------------------------------------");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5. 종료");
      System.out.println("--------------------------------------------");
      System.out.print("선택> ");

      int selectNo = Integer.parseInt(scanner.nextLine());
      if (selectNo == 1) {
        createAccount();
      } else if (selectNo == 2) {
        accountList();
      } else if (selectNo == 3) {
        deposit();
      } else if (selectNo == 4) {
        withdraw();
      } else if (selectNo == 5) {
        isRunning = false;
      }
    }
    scanner.close();
    System.out.println("프로그램 종료");
  }
}


