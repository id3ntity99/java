package sub3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sub1.Apple;;

public class MapTest {
  public static void main(String[] args) {
    HashMap<Character, String> map = new HashMap<>();

    map.put('A', "Apple");
    map.put('B', "Banana");
    map.put('C', "Cherry");

    System.out.println(map);

    System.out.println(map.size());

    // Print Hash Map
    for (char key : map.keySet()) {
      System.out.println(key + " - " + map.get(key));
    }

    // List와 Map을 이용
    List<Map<Integer, Apple>> mapList = new ArrayList<>();
    Map<Integer, Apple> m1 = new HashMap<>();
    Map<Integer, Apple> m2 = new HashMap<>();
    Map<Integer, Apple> m3 = new HashMap<>();

    m1.put(101, new Apple("Korea", 3000));
    m1.put(102, new Apple("USA", 3000));
    m1.put(103, new Apple("Japan", 3000));

    m2.put(201, new Apple("China", 3000));
    m2.put(202, new Apple("Austrailia", 3000));
    m2.put(203, new Apple("UK", 3000));

    m3.put(301, new Apple("Taiwan", 3000));
    m3.put(302, new Apple("Thailand", 3000));
    m3.put(303, new Apple("India", 3000));

    mapList.add(m1);
    mapList.add(m2);
    mapList.add(m3);

    Apple target = mapList.get(0).get(101);
    System.out.println(target);
  }
}
