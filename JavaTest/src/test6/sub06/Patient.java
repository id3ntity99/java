package test6.sub06;

public class Patient {
  private String name;
  private String id;
  private int age;
  private String diagnosis;

  public Patient(String name, String id, int age, String diagnosis) {
    this.name = name;
    this.id = id;
    this.age = age;
    this.diagnosis = diagnosis;
  }

  @Override
  public String toString() {
    return String.format("Patient [name=%s, id=%s, age=%d, diagnosis=%s]", name, id, age,
        diagnosis);
  }
}
