package test6.sub08;

public class Employee extends Person {
  protected String employeeId;
  protected String dept;
  protected int salary;

  public Employee(String name, String birth, String employeeId, String dept, int salary) {
    super(name, birth);
    this.employeeId = employeeId;
    this.dept = dept;
    this.salary = salary;
  }

  public void raiseSalary(int value) {
    this.salary += value;
  }

  public void changeDepartment(String dept) {
    System.out.println("부서 변경");
    this.dept = dept;
  }

  public void printEmployeeInfo() {
    super.printPersonInfo();
    System.out.printf("부서: %s%n금여: %d%n", dept, salary);
  }
}
