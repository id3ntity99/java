package test4;

import java.util.ArrayList;
import java.util.List;

class Member {
  String id;
  String name;
  int age;

  public Member(String id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("%s,%s,%d", id, name, age);
  }
}


public class Test08 {
  public static void main(String[] args) {
    Member m1 = new Member("hong", "홍길동", 30);
    Member m2 = new Member("lee", "이순신", 40);
    Member m3 = new Member("kim", "김유신", 50);

    List<Member> members = new ArrayList<>();
    members.add(m1);
    members.add(m2);
    members.add(m3);

    for (Member member : members) {
      System.out.println(member);
    }

  }
}
