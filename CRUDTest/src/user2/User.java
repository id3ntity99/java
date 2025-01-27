package user2;

public class User {
  private String uid;
  private String name;
  private String phoneNum;
  private int age;

  public User() {
    // Empty constructor, use setters instead.
  }

  public User(String uid, String name, String phoneNum, int age) {
    super();
    this.uid = uid;
    this.name = name;
    this.phoneNum = phoneNum;
    this.age = age;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User [uid=" + uid + ", name=" + name + ", phoneNum=" + phoneNum + ", age=" + age + "]";
  }



}
