package user2;

import java.util.List;
import java.util.Scanner;

public class AppMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
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
          break;
        case 2:
          List<User> users = dao.selectAll();
          if (users.isEmpty())
            System.out.println("Empty Set");
          else
            users.forEach(System.out::println);
          break;
        case 3:
          System.out.print("uid for serch: ");
          String uid = sc.next();
          User user = dao.select(uid);
          System.out.println(user);
          break;
        case 4:
          break;
        case 5:
          break;
        default:
          System.out.printf("Illegal option %d, try again%n", answer);
      }
    }
    System.out.println("프로그램 종료...");
    sc.close();
  }
}
