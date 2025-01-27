package test6.sub01;

public class Main {
  public static void main(String[] args) {
    StudentScore score = new StudentScore("홍길동", "S001", "자바", 90.0);

    score.printStudentInfo();
    System.out.println("--------------------");

    score.updateScore(98.0);
    System.out.println("--------------------");

    score.updateScore(102.0);
    System.out.println("--------------------");

    score.printStudentInfo();
    System.out.println("--------------------");
  }
}
