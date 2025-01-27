package test6.sub08;

public class Developer extends Employee {
  protected String field;

  public Developer(String name, String birth, String employeeId, String dept, int salary,
      String field) {
    super(name, birth, employeeId, dept, salary);
    this.field = field;
  }

  public void changeField(String field) {
    System.out.println("개발 분야 변경");
    this.field = field;
  }

  public void printDeveloperInfo() {
    super.printEmployeeInfo();
    System.out.printf("개발분야: %s%n", this.field);
  }
}
