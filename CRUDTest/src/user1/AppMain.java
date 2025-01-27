package user1;

import java.util.Scanner;

/*-
 * 날짜: 2025/01/27
 * 이름: 이현민
 * 내용: CRUD 실습
 */
public class AppMain {
  private static final Scanner sc = new Scanner(System.in);

  public static User inputUser() {
    System.out.print("ID: ");
    String uid = sc.next();

    System.out.print("Name: ");
    String name = sc.next();

    System.out.print("Phone Number: ");
    String phoneNum = sc.next();

    System.out.print("Age: ");
    int age = sc.nextInt();

    User user = new User(uid, name, phoneNum, age);
    return user;
  }

  public static void showUser() {

  }

  public static void findUser() {

  }

  public static void modifyUser() {

  }

  public static void removeUser() {

  }

  public static void main(String[] args) {
    System.out.println("--------------------");
    System.out.println("User1 CRUD 실습");
    System.out.println("--------------------");

    boolean isRunning = true;

    UserDao dao = UserDao.getInstance();

    while (isRunning) {
      System.out.println("0: 종료, 1: 입력, 2: 조회, 3: 검색, 4: 수정, 5: 삭제");
      System.out.print("선택 > ");

      int answer = sc.nextInt();

      switch (answer) {
        case 0:
          isRunning = false;
          break;
        case 1:
          User user = inputUser();
          dao.insertUser(user);
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          break;
      }
    }
    System.out.println("프로그램 종료...");
    sc.close();
  }
}
