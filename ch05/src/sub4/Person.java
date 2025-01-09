package sub4;

public class Person {
  protected String name;
  protected int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void work() {
    System.out.println("Person is working");
  }

  public void introduce() {
    System.out.printf("My name is %s and I'm %d years old\n", name, age);
  }
}
