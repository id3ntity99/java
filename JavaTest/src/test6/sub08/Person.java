package test6.sub08;

public class Person {
  protected String name;
  protected String birth;

  public Person(String name, String birth) {
    this.name = name;
    this.birth = birth;
  }

  public void printPersonInfo() {
    System.out.printf("이름: %s%n생년월일:%s%n", name, birth);
  }
}
