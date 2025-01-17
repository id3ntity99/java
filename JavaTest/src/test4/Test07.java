package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {
  public static Set<Integer> makeLotto() {
    Set<Integer> lottoSet = new HashSet<>();

    for (;;) {
      int num = (int) (Math.ceil(Math.random() * 45));
      lottoSet.add(num);

      if (lottoSet.size() == 6) {
        break;
      }
    }

    Set<Integer> treeSet = new TreeSet<>(lottoSet);
    return treeSet;
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(makeLotto());
    }
  }
}
