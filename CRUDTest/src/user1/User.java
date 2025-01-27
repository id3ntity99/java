package user1;

/**
 * Entity Object, or VO(Value Object). This class describes attributes that are retrieved from DB.
 */
public class User {
  private String uid;
  private String name;
  private String phoneNum;
  private int age;

  public User() {
    // Empty constructor, use setters
  }

  public User(String uid, String name, String phoneNum, int age) {
    this.uid = uid;
    this.name = name;
    this.phoneNum = phoneNum;
    this.age = age;
  }

  public String getUid() {
    return uid;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNum() {
    return phoneNum;
  }

  public int getAge() {
    return age;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("User [udi=%s, name=%s, phoneNum=%s, age=%d]", uid, name, phoneNum, age);
  }
}
