package test6.sub01;

public class StudentScore {
  private String studentName;
  private String studentId;
  private String subject;
  private double score;

  public StudentScore(String studentName, String studentId, String subject, double score) {
    this.studentName = studentName;
    this.studentId = studentId;
    this.subject = subject;
    this.score = score;
  }

  public void updateScore(double score) {
    if (score > 100) {
      System.out.println("잘못된 점수 입력");
      return;
    }
    this.score = score;
  }

  public double getScore() {
    return score;
  }

  public void printStudentInfo() {
    String s =
        String.format("학생이름: %s%n학생ID: %s%n과목:%s%n점수:%f", studentName, studentId, subject, score);
    System.out.println(s);
  }
}
