package sub4;

public class Engineer extends Person {
  private String field;

  public Engineer(String name, int age, String field) {
    super(name, age);
    this.field = field;
  }

  @Override
  public void work() {
    super.work();
    System.out.printf("저는 [%s] 엔지니어 입니다.\n", field);
  }
}
