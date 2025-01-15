package sub3;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
  public static void main(String[] args) {
    // Create Set object
    HashSet<Integer> set = new HashSet<Integer>();

    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);
    set.add(1);
    set.add(2);
    set.add(3);
    System.out.println(set);

    Iterator<Integer> iter = set.iterator();

    while (iter.hasNext()) {
      System.out.println(iter.next());
    }
  }
}
