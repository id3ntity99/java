package user1;

import java.util.List;
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

    return new User(uid, name, phoneNum, age);
  }

  public static String findUser() {
    System.out.print("ID: ");
    return sc.next();
  }

  public static User modifyUser() {
    System.out.print("New ID: ");
    String uid = sc.next();

    System.out.print("New Name: ");
    String name = sc.next();

    System.out.print("New Phone Number: ");
    String phoneNum = sc.next();

    System.out.print("New Age: ");
    int age = sc.nextInt();

    return new User(uid, name, phoneNum, age);
  }

  public static String removeUser() {
    System.out.print("ID for remove: ");
    return sc.next();
  }

  public static void main(String[] args) {
    System.out.println("--------------------");
    System.out.println("User1 CRUD 실습");
    System.out.println("--------------------");

    boolean isRunning = true;

    UserDAO dao = UserDAO.getInstance();

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
          List<User> users = dao.selectUsers();
          for (User u : users)
            System.out.println(u);
          break;
        case 3:
          String uid = findUser();
          user = dao.selectUser(uid);
          if (user != null) {
            System.out.println(user);
          } else
            System.out.println("No such user exists");
          break;
        case 4:
          user = modifyUser();
          dao.updateUser(user);
          System.out.println("Modification complete");
          break;
        case 5:
          String removeUid = removeUser();
          dao.deleteUser(removeUid);
          System.out.printf("Removed %s%n", removeUid);
          break;
        default:
          System.out.printf("Illegal option %d, try again%n", answer);
      }
    }
    System.out.println("프로그램 종료...");
    sc.close();
  }
}
