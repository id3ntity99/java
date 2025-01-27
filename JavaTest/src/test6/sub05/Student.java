package test6.sub05;

public class Student {
  private String name;
  private String studentId;
  private Subject[] subjects;
  private int[] scores;
  private int subjectCount;

  public Student(String name, String studentId) {
    this.name = name;
    this.studentId = studentId;
    this.subjects = new Subject[10];
    this.scores = new int[10];
    this.subjectCount = 0;
  }

  public void enrollSubject(Subject subject) {
    this.subjects[subjectCount++] = subject;
    subject.addStduent(this);
    System.out.printf("%s - %s 과목 신청완료\n", name, subject.getName());
  }

  public void setScore(Subject subject, int score) {
    int idx = 0;
    for (int i = 0; i < subjects.length; i++) {
      if (subject.getName().equals(subjects[i].getName())) {
        idx = i;
        break;
      }
    }

    scores[idx] = score;
    System.out.printf("%s - %s 점수 입력완료\n", name, subject.getName());
  }

  public void printStudentInfo() {
    System.out.printf("학생명: %s\n아이디: %s\n성적\n", name, studentId);
    for (int i = 0; i < subjects.length; i++) {
      if (subjects[i] == null)
        break;
      Subject currSubject = subjects[i];
      int currScore = scores[i];
      System.out.printf(" - %s:%d\n", currSubject.getName(), currScore);
    }
  }

  public String getName() {
    return name;
  }
}
