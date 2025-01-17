package test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Orange {
  private String country;
  private int price;

  public Orange(String country, int price) {
    this.country = country;
    this.price = price;
  }

  public void show() {
    String s = String.format("원산지: %s%n가격:%d", country, price);
    System.out.println(s);
  }
}


public class Test09 {
  public static void main(String[] args) {
    List<Orange> list1 = new ArrayList<>();
    list1.add(new Orange("파주", 3000));
    list1.add(new Orange("이천", 3000));
    list1.add(new Orange("수원", 3000));

    List<Orange> list2 = new ArrayList<>();
    list2.add(new Orange("청주", 3000));
    list2.add(new Orange("충주", 3000));
    list2.add(new Orange("단양", 3000));

    List<Orange> list3 = new ArrayList<>();
    list3.add(new Orange("밀양", 3000));
    list3.add(new Orange("함안", 3000));
    list3.add(new Orange("합천", 3000));

    HashMap<String, List<Orange>> map = new HashMap<>();
    map.put("gyeonggi", list1);
    map.put("chungbuk", list2);
    map.put("gyungnam", list3);

    List<Orange> list = map.get("gyeonggi");
    Orange orange = list.get(2);
    orange.show();
    map.get("chungbuk").get(1).show();
    map.get("gyungnam").get(0).show();
  }
}
